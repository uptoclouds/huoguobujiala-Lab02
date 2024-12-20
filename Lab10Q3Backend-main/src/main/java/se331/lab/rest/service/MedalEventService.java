package se331.lab.rest.service;

import se331.lab.rest.entity.MedalEvent;
import se331.lab.rest.repository.MedalEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MedalEventService {
    @Autowired
    private MedalEventRepository medalEventRepository;

    public Page<MedalEvent> getMedalEvents(Pageable pageable) {
        return medalEventRepository.findAll(pageable);
    }

    public MedalEvent getMedalEventById(Long id) {
        return medalEventRepository.findById(id).orElse(null);
    }
}