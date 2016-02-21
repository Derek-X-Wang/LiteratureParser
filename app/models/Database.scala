package models

import sorm._
/**
  * Created by Derek on 2/4/2016.
  */
object Database extends Instance(entities = Seq(Entity[Person]()), url = "jdbc:h2:mem:test")
