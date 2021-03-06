package com.nouhoun.springboot.jwt.integration.service.impl;

import com.nouhoun.springboot.jwt.integration.domain.Match;
import com.nouhoun.springboot.jwt.integration.domain.RandomCity;
import com.nouhoun.springboot.jwt.integration.domain.User;
import com.nouhoun.springboot.jwt.integration.repository.RandomCityRepository;
import com.nouhoun.springboot.jwt.integration.repository.UserRepository;
import com.nouhoun.springboot.jwt.integration.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nouhoun.springboot.jwt.integration.repository.*;

import java.util.List;

/**
 * Created by nydiarra on 07/05/17.
 */
@Service
public class GenericServiceImpl implements GenericService {
	
    @Autowired
    private UserRepository userRepository;
    
    @Autowired 
    private MatchRepository matchRepository;

    @Autowired
    private RandomCityRepository randomCityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>)userRepository.findAll();
    }
    
    @Override
    public Match findByIdMatch(Long idMatch){
        return matchRepository.findByIdMatch(idMatch);
    }

    @Override
    public List<Match> findAll(){
        return (List<Match>)matchRepository.findAll(); 
    }
    
    @Override
    public Match save(Match match){
        return matchRepository.save(match);
    }
    
    @Override
    public void delete(Long idMatch){
        matchRepository.delete(idMatch);
    }

    @Override
    public void deleteAll() {
        matchRepository.deleteAll();
    }

    @Override
    public List<RandomCity> findAllRandomCities() {
        return (List<RandomCity>)randomCityRepository.findAll();
    }
    
}
   