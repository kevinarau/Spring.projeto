package Dio.projeto.Spring.Spring.projeto.service;

import Dio.projeto.Spring.Spring.projeto.model.Cliente;
import Dio.projeto.Spring.Spring.projeto.model.ClienteRepository;
import Dio.projeto.Spring.Spring.projeto.model.Endereco;
import Dio.projeto.Spring.Spring.projeto.model.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteImplementos implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        if (clienteRepository ==  null){
            System.out.println("Esse cliente não Existe");
        }
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> byId = clienteRepository.findById(id);
        return byId.get();

    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteCep(cliente);
    }


    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> bdCliente = clienteRepository.findById(id);
        if (bdCliente.isPresent()){
            salvarClienteCep(cliente);
        }
    }


    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }



    private void salvarClienteCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco endereco1 = viaCepService.ConsutarCep(cep);
            enderecoRepository.save(endereco1);
            return endereco1;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

}
