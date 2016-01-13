package efficiency.ordering_cellstate_resources_policies

import ClusterSchedulingSimulation.CellState

/**
 * Created by dfernandez on 8/1/16.
 */
trait CellStateResourcesSorter {
  def orderResources(cellstate: CellState)
  def getName() : String
}