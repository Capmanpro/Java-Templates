package com.novikov.service;

import com.novikov.entity.Manufacture;

public interface PhoneService {
    Manufacture getManufactureByPhone(Long manuId);
}
