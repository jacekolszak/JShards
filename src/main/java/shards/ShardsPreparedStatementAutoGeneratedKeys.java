package shards;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ShardsPreparedStatementAutoGeneratedKeys extends ShardsPreparedStatement {

    private int autoGeneratedKeys;

    public ShardsPreparedStatementAutoGeneratedKeys(ShardsConnection connection, String sql, int autoGeneratedKeys) throws SQLException {
        super(connection, sql);
        this.autoGeneratedKeys = autoGeneratedKeys;
    }
    
    @Override
    protected PreparedStatement internalCreateStatement(Connection connection, String rewrittenQuery) throws SQLException {
        return connection.prepareStatement(rewrittenQuery, autoGeneratedKeys);
    }

}
