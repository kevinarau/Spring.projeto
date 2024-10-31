package Dio.projeto.Spring.Spring.projeto.service;

import Dio.projeto.Spring.Spring.projeto.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "ViaCep", url = "viacep.com.br/ws")
public interface ViaCepService {


   // @RequestMapping(method = RequestMethod.GET,value = "/{CEP}/json")
    @GetMapping( "/{CEP}/json")
    Endereco ConsutarCep(@PathVariable ("CEP") String CEP);
    }

