package com.assiz.cursos.imageliteapi.domain.service;

import com.assiz.cursos.imageliteapi.domain.entity.Image;

import java.util.Optional;

public interface ImageService {

    Image save(Image image);

    Optional<Image> getById(String id);

}
