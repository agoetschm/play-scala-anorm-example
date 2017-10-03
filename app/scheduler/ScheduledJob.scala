package scheduler

import akka.actor._
import play.api.Logger
import SchduledJob._

//import scala.concurrent.ExecutionContext.Implicits.global

class ScheduledJob extends Actor {

  def receive: Receive = {
    case Msg => Logger.info("got message")
  }
}

object SchduledJob {

  case object Msg

}
