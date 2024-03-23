package br.com.treinaweb.twprojects.web.clients.controllers;

import br.com.treinaweb.twprojects.core.models.Client;
import br.com.treinaweb.twprojects.core.repositories.ClientRepository;
import br.com.treinaweb.twprojects.web.clients.dtos.ClientViewModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Map;

@Controller
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientRepository clientRepository;

    @GetMapping
    public ModelAndView index() {
        var clients = clientRepository.findAll()
                .stream()
                .map((client) -> ClientViewModel.of(client)).toList();

        var model = Map.of("clients", clients);
        return new ModelAndView("clients/index", model);

    }
}
