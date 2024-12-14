package com.example.skillcinema.data

import com.example.skillcinema.entity.director.Director
import com.example.skillcinema.entity.director.DirectorPagedList

class DirectorPagedListDto(
    override val items: List<Director>
    ): DirectorPagedList
