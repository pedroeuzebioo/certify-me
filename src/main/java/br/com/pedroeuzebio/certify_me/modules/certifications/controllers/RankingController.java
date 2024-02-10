package br.com.pedroeuzebio.certify_me.modules.certifications.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedroeuzebio.certify_me.modules.certifications.useCases.Top10RankingUseCase;
import br.com.pedroeuzebio.certify_me.modules.students.entities.CertificationStudentEntity;
import br.com.pedroeuzebio.certify_me.modules.students.repositories.CertificationStudentRepository;

@RestController
@RequestMapping("/ranking")
public class RankingController {

    @Autowired
    private Top10RankingUseCase top10RankingUseCase;

    @GetMapping("/top10")
    public List<CertificationStudentEntity> top10() {
        return this.top10RankingUseCase.execute();
    }
}
