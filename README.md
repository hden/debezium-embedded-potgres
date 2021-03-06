# debezium-embedded-jdbc [![CircleCI](https://circleci.com/gh/hden/debezium-embedded-jdbc/tree/master.svg?style=svg)](https://circleci.com/gh/hden/debezium-embedded-jdbc/tree/master) [![codecov](https://codecov.io/gh/hden/debezium-embedded-jdbc/branch/master/graph/badge.svg)](https://codecov.io/gh/hden/debezium-embedded-jdbc)

Debezium DatabaseHistory and OffsetBackingStore implementations backed by JDBC.

## Usage

[![Clojars Project](https://img.shields.io/clojars/v/hden/debezium-embedded-jdbc.svg)](https://clojars.org/hden/debezium-embedded-jdbc)

### JDBCOffsetBackingStore

```connector.properties
offset.storage=io.debezium.contrib.jdbc.JDBCOffsetBackingStore
offset.storage.jdbc.url=jdbc:sqlite:
offset.storage.jdbc.table=offsets
offset.storage.jdbc.instance.id=debezium
```

### JDBCDatabaseHistory

```connector.properties
database.history=io.debezium.contrib.jdbc.JDBCDatabaseHistory
database.history.jdbc.url=jdbc:sqlite:
database.history.jdbc.table=schema
database.history.jdbc.instance.id=debezium
```

## License
Apache 2.0
