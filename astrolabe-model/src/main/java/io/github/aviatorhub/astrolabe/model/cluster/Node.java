package io.github.aviatorhub.astrolabe.model.cluster;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Node {

  private String name;
  private String address;
  private Role role;

}
