package com.example.active_fit_back.services.impl;


import com.example.active_fit_back.model.Pago;
import com.example.active_fit_back.model.Rol;
import com.example.active_fit_back.repository.PagoRepository;
import com.example.active_fit_back.repository.RolRepository;
import com.example.active_fit_back.services.PagoService;
import com.example.active_fit_back.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class PagoServiceImpl implements PagoService {
    @Autowired
    private PagoRepository pagoRepository;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    private static final String CACHE_KEY = "pagos:data";



    @Override
    public Long save(Pago pago) {
        Pago savedPago = pagoRepository.save(pago);
        updateRedisCache();
        return savedPago.getId();
    }

    @Override
    public List<Pago> findAllFromPostgres() {
        return pagoRepository.findAll();
    }

    @Override
    public List<Pago> findAllFromRedis() {
        return (List<Pago>) redisTemplate.opsForValue().get(CACHE_KEY);
    }

    private void updateRedisCache() {
        List<Pago> pagos = pagoRepository.findAll();
        redisTemplate.opsForValue().set(CACHE_KEY, pagos, 1, TimeUnit.HOURS);

    }


}
