package com.epam.university.entity;

public interface IHasId {
    Long getId();
    
    void setId(Long id);
    
    boolean isNew();
}
