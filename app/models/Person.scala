package models

import play.api.libs.json.Json

/**
  * Created by Derek on 2/4/2016.
  */
case class Person(name: String)

object Person {
  implicit val personFormat = Json.format[Person]
}
