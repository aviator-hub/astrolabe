package io.github.aviatorhub.astrolabe.provider;

import com.google.common.base.Preconditions;
import io.github.aviatorhub.astrolabe.core.DataSourceManager;
import io.github.aviatorhub.astrolabe.model.datasource.DataSourceSpec;
import io.github.aviatorhub.astrolabe.model.table.DatabaseSpec;
import io.github.aviatorhub.astrolabe.model.table.TableSpec;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import javax.sql.DataSource;
import org.apache.commons.collections4.CollectionUtils;
// TODO
public class MysqlTableProvider implements TableMetaProvider {

  @Override
  public Optional<TableSpec> loadTable(DataSourceSpec dataSourceSpec, String database, String table)
      throws SQLException {
    DataSource dataSource = DataSourceManager.dataSource(dataSourceSpec);
    try (Connection conn = dataSource.getConnection()) {
      DatabaseMetaData metaData = conn.getMetaData();
      List<DatabaseSpec> databaseSpecOpt = databaseSpec(metaData, database);
      Preconditions.checkArgument(CollectionUtils.size(databaseSpecOpt) == 1);
      tableSpec(metaData, databaseSpecOpt.get(0), table);
    }
    return null;
  }

  @Override
  public Optional<DatabaseSpec> loadDatabase(DataSourceSpec dataSourceSpec, String database) {
    DataSource dataSource = DataSourceManager.dataSource(dataSourceSpec);
    return null;
  }

  @Override
  public List<DatabaseSpec> databaseSpec(DatabaseMetaData meta, String database)
      throws SQLException {
    List<DatabaseSpec> databaseSpecList = new LinkedList<>();
    try (ResultSet rs = meta.getSchemas(database, database)) {
      while (rs.next()) {
        DatabaseSpec databaseSpec = new DatabaseSpec();
        databaseSpec.setName(rs.getString(1));
        databaseSpecList.add(databaseSpec);
      }
    }
    return databaseSpecList;
  }

  @Override
  public List<TableSpec> tableSpec(DatabaseMetaData meta, DatabaseSpec databaseSpec, String table)
      throws SQLException {
//    meta.getColumns()
//        meta.getColumns()
//    List<TableSpec> tableSpecList = new LinkedList<>();
//    try (ResultSet rs = meta.getTables(database, database, table, null)) {
//      while (rs.next()) {
//        TableSpec tableSpec = new TableSpec();
//        tableSpec.setName(rs.getString(2));
//      }
//    }
    return null;
  }


}
