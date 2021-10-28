package io.github.aviatorhub.astrolabe.model.cluster;

import io.github.aviatorhub.astrolabe.model.constant.ClusterType;
import io.github.aviatorhub.astrolabe.model.constant.DeployType;
import java.util.List;

public class ClusterSpec {

  private String name;
  private ClusterType clusterType;
  private DeployType deployType;
  private List<NodeSpec> nodeSpecList;
}
