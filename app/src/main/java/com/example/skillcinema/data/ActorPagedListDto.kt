package com.example.skillcinema.data

import com.example.skillcinema.entity.actor.Actor
import com.example.skillcinema.entity.actor.ActorPagedList

class ActorPagedListDto(
    override val items: List<Actor>
    ): ActorPagedList
