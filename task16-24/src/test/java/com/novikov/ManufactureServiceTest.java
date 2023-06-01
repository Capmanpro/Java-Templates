package com.novikov;

import com.novikov.repository.ManufactureRepository;
import com.novikov.entity.Manufacture;
import com.novikov.service.ManufactureService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class ManufactureServiceTest {

    @Mock
    ManufactureRepository repository;
    @Test
    void getManu(){
        Manufacture manufacture = new Manufacture();
        manufacture.setAddress("USA");
        manufacture.setName("Apple");
        manufacture.setId(1L);
        Mockito.when(repository.findById(1L)).thenReturn(Optional.of(manufacture));
        ManufactureService service = new ManufactureService();
        service.setRepository(repository);
        Assertions.assertEquals("Apple",service.getManu(1L).getName());
    }

}
