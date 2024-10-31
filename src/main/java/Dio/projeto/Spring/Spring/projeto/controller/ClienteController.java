package Dio.projeto.Spring.Spring.projeto.controller;

import Dio.projeto.Spring.Spring.projeto.model.Cliente;
import Dio.projeto.Spring.Spring.projeto.model.ClienteRepository;
import Dio.projeto.Spring.Spring.projeto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {

     @Autowired
     public ClienteService clienteService;

     @GetMapping
   public  ResponseEntity<Iterable<Cliente>> buscarTodos(){
        return ResponseEntity.ok(clienteService.buscarTodos());
   }

   @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id ){
         return  ResponseEntity.ok(clienteService.buscarPorId(id));
   }

   @PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente){
         clienteService.inserir(cliente);
         return ResponseEntity.ok(cliente);
   }

   @PutMapping(value = "/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente ) {
     clienteService.atualizar(id,cliente);
     return ResponseEntity.ok(cliente);
     }

     @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
         clienteService.deletar(id);
         return ResponseEntity.ok().build();
    }

}
