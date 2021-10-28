package io.github.aviatorhub.astrolabe.model.cluster;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NodeSpec {

  private String name;
  private String address;
  private RoleSpec roleSpec;

}
