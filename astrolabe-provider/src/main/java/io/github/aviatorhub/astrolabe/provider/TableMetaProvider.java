package io.github.aviatorhub.astrolabe.provider;

import io.github.aviatorhub.astrolabe.model.datasource.DataSourceSpec;
import io.github.aviatorhub.astrolabe.model.table.DatabaseSpec;
import io.github.aviatorhub.astrolabe.model.table.TableSpec;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface TableMetaProvider extends MetaProvider {

  Optional<TableSpec> loadTable(DataSourceSpec datasource, String database, String table)
      throws SQLException;

  Optional<DatabaseSpec> loadDatabase(DataSourceSpec datasource, String database);

  List<DatabaseSpec> databaseSpec(DatabaseMetaData meta, String database) throws SQLException;

  List<TableSpec> tableSpec(DatabaseMetaData meta, DatabaseSpec databaseSpec, String table)
      throws SQLException;
}
