package scheduler

import akka.actor.{ActorRef, ActorSystem}
import com.google.inject.Inject
import com.google.inject.name.Named
import com.typesafe.akka.extension.quartz.QuartzSchedulerExtension

class Scheduler @Inject() (system: ActorSystem,
                            @Named("scheduled-job") scheduledJob: ActorRef) {

  QuartzSchedulerExtension(system).schedule("ScheduledJob", scheduledJob, SchduledJob.Msg)

  scheduledJob ! SchduledJob.Msg
}
