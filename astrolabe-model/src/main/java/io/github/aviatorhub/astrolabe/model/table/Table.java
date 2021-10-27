package io.github.aviatorhub.astrolabe.model.table;

import io.github.aviatorhub.astrolabe.model.constant.TableType;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Table {

  private String database;
  private String name;
  private String comment;
  private TableType type;
  private Integer version;
  private List<Column> columnList;
}
