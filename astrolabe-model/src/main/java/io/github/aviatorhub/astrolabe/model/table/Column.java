package io.github.aviatorhub.astrolabe.model.table;

import io.github.aviatorhub.astrolabe.model.common.DataType;
import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Column implements Serializable {

  private String name;
  private DataType type;
  private String comment;
  private boolean physicalColumn = true;
}
