package com.cumulus.repo.lab.service.impl;

import com.cumulus.repo.lab.service.ModelServiceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ModelServiceServiceImpl implements ModelServiceService {

    private final Logger log = LoggerFactory.getLogger(ModelServiceServiceImpl.class);

}
