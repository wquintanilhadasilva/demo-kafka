package com.example.kafka;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/v1/domains")
public class DomainController {

    @GetMapping("/search")
    public DomainList lookup(@RequestParam(value="domain", required=true) String name) {
        var domainsList = new ArrayList<DomainList>();
        DomainList lista = new DomainList();

        IntStream.range(0, 50)
                .forEach(i -> lista.getDomains().add(Domain.builder()
                        .domain("Name Of Domain:" + i)
                        .MX("MX: " + i)
                        .NS("NS: " + i)
                        .TXT("TXT: " + i)
                        .A("A: " + i)
                        .CNAME("CNAME: " + i)
                        .create_date("2023-" + i)
                        .update_date("2024-" + i)
                        .country("BR")
                        .isDead(i % 2 == 0)
                        .build()));

        return lista;
    }
}
