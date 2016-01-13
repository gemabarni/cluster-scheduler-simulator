package efficiency.power_off_policies

import ClusterSchedulingSimulation.{CellState, Job}

/**
 * Created by dfernandez on 13/1/16.
 */
object NoPowerOffPolicy extends PowerOffPolicy{
  override def powerOff(cellstate: CellState, job: Job): Unit = {

  }

  override def getName(): String = {
    "no-power-off"
  }
}