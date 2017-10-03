package scheduler

import net.codingwell.scalaguice.ScalaModule
import play.api.libs.concurrent.AkkaGuiceSupport

class SchedulerModule extends ScalaModule with AkkaGuiceSupport {

  def configure() = {
    bindActor[ScheduledJob]("scheduled-job")
    bind[Scheduler].asEagerSingleton()
  }
}
