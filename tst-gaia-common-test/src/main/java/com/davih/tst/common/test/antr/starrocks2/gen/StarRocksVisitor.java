// Generated from /home/david/flower/tst-gaia/tst-gaia-common-test/src/main/java/com/davih/tst/common/test/antr/starrocks2/StarRocks.g4 by ANTLR 4.13.2
package com.davih.tst.common.test.antr.starrocks2.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StarRocksParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StarRocksVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#sqlStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatements(StarRocksParser.SqlStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(StarRocksParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(StarRocksParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(StarRocksParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#useDatabaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseDatabaseStatement(StarRocksParser.UseDatabaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#useCatalogStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseCatalogStatement(StarRocksParser.UseCatalogStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#setCatalogStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCatalogStatement(StarRocksParser.SetCatalogStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showDatabasesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabasesStatement(StarRocksParser.ShowDatabasesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterDbQuotaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDbQuotaStatement(StarRocksParser.AlterDbQuotaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createDbStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDbStatement(StarRocksParser.CreateDbStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropDbStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDbStatement(StarRocksParser.DropDbStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showCreateDbStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateDbStatement(StarRocksParser.ShowCreateDbStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterDatabaseRenameStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabaseRenameStatement(StarRocksParser.AlterDatabaseRenameStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#recoverDbStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecoverDbStmt(StarRocksParser.RecoverDbStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showDataStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDataStmt(StarRocksParser.ShowDataStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableStatement(StarRocksParser.CreateTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#columnDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDesc(StarRocksParser.ColumnDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#charsetName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetName(StarRocksParser.CharsetNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#defaultDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultDesc(StarRocksParser.DefaultDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#generatedColumnDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratedColumnDesc(StarRocksParser.GeneratedColumnDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#indexDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexDesc(StarRocksParser.IndexDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#engineDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngineDesc(StarRocksParser.EngineDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#charsetDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetDesc(StarRocksParser.CharsetDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#collateDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateDesc(StarRocksParser.CollateDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#keyDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyDesc(StarRocksParser.KeyDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#orderByDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByDesc(StarRocksParser.OrderByDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#columnNullable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNullable(StarRocksParser.ColumnNullableContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#typeWithNullable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeWithNullable(StarRocksParser.TypeWithNullableContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#aggStateDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggStateDesc(StarRocksParser.AggStateDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#aggDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggDesc(StarRocksParser.AggDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#rollupDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollupDesc(StarRocksParser.RollupDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#rollupItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollupItem(StarRocksParser.RollupItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dupKeys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDupKeys(StarRocksParser.DupKeysContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#fromRollup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromRollup(StarRocksParser.FromRollupContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#orReplace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrReplace(StarRocksParser.OrReplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(StarRocksParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createTableAsSelectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableAsSelectStatement(StarRocksParser.CreateTableAsSelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableStatement(StarRocksParser.DropTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#cleanTemporaryTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCleanTemporaryTableStatement(StarRocksParser.CleanTemporaryTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableStatement(StarRocksParser.AlterTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndexStatement(StarRocksParser.CreateIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndexStatement(StarRocksParser.DropIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#indexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexType(StarRocksParser.IndexTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTableStatement(StarRocksParser.ShowTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showTemporaryTablesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTemporaryTablesStatement(StarRocksParser.ShowTemporaryTablesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showCreateTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTableStatement(StarRocksParser.ShowCreateTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showColumnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumnStatement(StarRocksParser.ShowColumnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showTableStatusStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTableStatusStatement(StarRocksParser.ShowTableStatusStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#refreshTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshTableStatement(StarRocksParser.RefreshTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showAlterStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowAlterStatement(StarRocksParser.ShowAlterStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#descTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescTableStatement(StarRocksParser.DescTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createTableLikeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableLikeStatement(StarRocksParser.CreateTableLikeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowIndexStatement(StarRocksParser.ShowIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#recoverTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecoverTableStatement(StarRocksParser.RecoverTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#truncateTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTableStatement(StarRocksParser.TruncateTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#cancelAlterTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancelAlterTableStatement(StarRocksParser.CancelAlterTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showPartitionsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPartitionsStatement(StarRocksParser.ShowPartitionsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#recoverPartitionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecoverPartitionStatement(StarRocksParser.RecoverPartitionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createViewStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateViewStatement(StarRocksParser.CreateViewStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterViewStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterViewStatement(StarRocksParser.AlterViewStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropViewStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropViewStatement(StarRocksParser.DropViewStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#columnNameWithComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNameWithComment(StarRocksParser.ColumnNameWithCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#submitTaskStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubmitTaskStatement(StarRocksParser.SubmitTaskStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#taskClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaskClause(StarRocksParser.TaskClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropTaskStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTaskStatement(StarRocksParser.DropTaskStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#taskScheduleDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaskScheduleDesc(StarRocksParser.TaskScheduleDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createMaterializedViewStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateMaterializedViewStatement(StarRocksParser.CreateMaterializedViewStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#mvPartitionExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMvPartitionExprs(StarRocksParser.MvPartitionExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#materializedViewDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterializedViewDesc(StarRocksParser.MaterializedViewDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showMaterializedViewsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowMaterializedViewsStatement(StarRocksParser.ShowMaterializedViewsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropMaterializedViewStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropMaterializedViewStatement(StarRocksParser.DropMaterializedViewStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterMaterializedViewStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterMaterializedViewStatement(StarRocksParser.AlterMaterializedViewStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#refreshMaterializedViewStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshMaterializedViewStatement(StarRocksParser.RefreshMaterializedViewStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#cancelRefreshMaterializedViewStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancelRefreshMaterializedViewStatement(StarRocksParser.CancelRefreshMaterializedViewStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#adminSetConfigStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdminSetConfigStatement(StarRocksParser.AdminSetConfigStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#adminSetReplicaStatusStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdminSetReplicaStatusStatement(StarRocksParser.AdminSetReplicaStatusStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#adminShowConfigStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdminShowConfigStatement(StarRocksParser.AdminShowConfigStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#adminShowReplicaDistributionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdminShowReplicaDistributionStatement(StarRocksParser.AdminShowReplicaDistributionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#adminShowReplicaStatusStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdminShowReplicaStatusStatement(StarRocksParser.AdminShowReplicaStatusStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#adminRepairTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdminRepairTableStatement(StarRocksParser.AdminRepairTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#adminCancelRepairTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdminCancelRepairTableStatement(StarRocksParser.AdminCancelRepairTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#adminCheckTabletsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdminCheckTabletsStatement(StarRocksParser.AdminCheckTabletsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#adminSetPartitionVersion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdminSetPartitionVersion(StarRocksParser.AdminSetPartitionVersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#killStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKillStatement(StarRocksParser.KillStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#syncStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyncStatement(StarRocksParser.SyncStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterSystemStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSystemStatement(StarRocksParser.AlterSystemStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#cancelAlterSystemStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancelAlterSystemStatement(StarRocksParser.CancelAlterSystemStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showComputeNodesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowComputeNodesStatement(StarRocksParser.ShowComputeNodesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createExternalCatalogStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateExternalCatalogStatement(StarRocksParser.CreateExternalCatalogStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showCreateExternalCatalogStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateExternalCatalogStatement(StarRocksParser.ShowCreateExternalCatalogStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropExternalCatalogStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropExternalCatalogStatement(StarRocksParser.DropExternalCatalogStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showCatalogsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCatalogsStatement(StarRocksParser.ShowCatalogsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterCatalogStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterCatalogStatement(StarRocksParser.AlterCatalogStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createStorageVolumeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStorageVolumeStatement(StarRocksParser.CreateStorageVolumeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#typeDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDesc(StarRocksParser.TypeDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#locationsDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationsDesc(StarRocksParser.LocationsDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showStorageVolumesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowStorageVolumesStatement(StarRocksParser.ShowStorageVolumesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropStorageVolumeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropStorageVolumeStatement(StarRocksParser.DropStorageVolumeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterStorageVolumeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterStorageVolumeStatement(StarRocksParser.AlterStorageVolumeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterStorageVolumeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterStorageVolumeClause(StarRocksParser.AlterStorageVolumeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#modifyStorageVolumePropertiesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyStorageVolumePropertiesClause(StarRocksParser.ModifyStorageVolumePropertiesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#modifyStorageVolumeCommentClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyStorageVolumeCommentClause(StarRocksParser.ModifyStorageVolumeCommentClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#descStorageVolumeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescStorageVolumeStatement(StarRocksParser.DescStorageVolumeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#setDefaultStorageVolumeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDefaultStorageVolumeStatement(StarRocksParser.SetDefaultStorageVolumeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#updateFailPointStatusStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateFailPointStatusStatement(StarRocksParser.UpdateFailPointStatusStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showFailPointStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFailPointStatement(StarRocksParser.ShowFailPointStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createDictionaryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDictionaryStatement(StarRocksParser.CreateDictionaryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropDictionaryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDictionaryStatement(StarRocksParser.DropDictionaryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#refreshDictionaryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshDictionaryStatement(StarRocksParser.RefreshDictionaryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showDictionaryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDictionaryStatement(StarRocksParser.ShowDictionaryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#cancelRefreshDictionaryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancelRefreshDictionaryStatement(StarRocksParser.CancelRefreshDictionaryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dictionaryColumnDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryColumnDesc(StarRocksParser.DictionaryColumnDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dictionaryName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryName(StarRocksParser.DictionaryNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterClause(StarRocksParser.AlterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#addFrontendClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddFrontendClause(StarRocksParser.AddFrontendClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropFrontendClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFrontendClause(StarRocksParser.DropFrontendClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#modifyFrontendHostClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyFrontendHostClause(StarRocksParser.ModifyFrontendHostClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#addBackendClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddBackendClause(StarRocksParser.AddBackendClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropBackendClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropBackendClause(StarRocksParser.DropBackendClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#decommissionBackendClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecommissionBackendClause(StarRocksParser.DecommissionBackendClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#modifyBackendClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyBackendClause(StarRocksParser.ModifyBackendClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#addComputeNodeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddComputeNodeClause(StarRocksParser.AddComputeNodeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropComputeNodeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropComputeNodeClause(StarRocksParser.DropComputeNodeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#modifyBrokerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyBrokerClause(StarRocksParser.ModifyBrokerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterLoadErrorUrlClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterLoadErrorUrlClause(StarRocksParser.AlterLoadErrorUrlClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createImageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateImageClause(StarRocksParser.CreateImageClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#cleanTabletSchedQClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCleanTabletSchedQClause(StarRocksParser.CleanTabletSchedQClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#decommissionDiskClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecommissionDiskClause(StarRocksParser.DecommissionDiskClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#cancelDecommissionDiskClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancelDecommissionDiskClause(StarRocksParser.CancelDecommissionDiskClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#disableDiskClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisableDiskClause(StarRocksParser.DisableDiskClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#cancelDisableDiskClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancelDisableDiskClause(StarRocksParser.CancelDisableDiskClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createIndexClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndexClause(StarRocksParser.CreateIndexClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropIndexClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndexClause(StarRocksParser.DropIndexClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#tableRenameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRenameClause(StarRocksParser.TableRenameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#swapTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwapTableClause(StarRocksParser.SwapTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#modifyPropertiesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyPropertiesClause(StarRocksParser.ModifyPropertiesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#modifyCommentClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyCommentClause(StarRocksParser.ModifyCommentClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#optimizeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimizeClause(StarRocksParser.OptimizeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#addColumnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumnClause(StarRocksParser.AddColumnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#addColumnsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumnsClause(StarRocksParser.AddColumnsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropColumnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropColumnClause(StarRocksParser.DropColumnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#modifyColumnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyColumnClause(StarRocksParser.ModifyColumnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#columnRenameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnRenameClause(StarRocksParser.ColumnRenameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#reorderColumnsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReorderColumnsClause(StarRocksParser.ReorderColumnsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#rollupRenameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollupRenameClause(StarRocksParser.RollupRenameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#compactionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompactionClause(StarRocksParser.CompactionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#subfieldName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubfieldName(StarRocksParser.SubfieldNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#nestedFieldName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedFieldName(StarRocksParser.NestedFieldNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#addFieldClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddFieldClause(StarRocksParser.AddFieldClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropFieldClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFieldClause(StarRocksParser.DropFieldClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createOrReplaceTagClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOrReplaceTagClause(StarRocksParser.CreateOrReplaceTagClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createOrReplaceBranchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOrReplaceBranchClause(StarRocksParser.CreateOrReplaceBranchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropBranchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropBranchClause(StarRocksParser.DropBranchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropTagClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTagClause(StarRocksParser.DropTagClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#tableOperationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOperationClause(StarRocksParser.TableOperationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#tagOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagOptions(StarRocksParser.TagOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#branchOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranchOptions(StarRocksParser.BranchOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#snapshotRetention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSnapshotRetention(StarRocksParser.SnapshotRetentionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#refRetain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefRetain(StarRocksParser.RefRetainContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#maxSnapshotAge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxSnapshotAge(StarRocksParser.MaxSnapshotAgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#minSnapshotsToKeep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinSnapshotsToKeep(StarRocksParser.MinSnapshotsToKeepContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#snapshotId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSnapshotId(StarRocksParser.SnapshotIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#timeUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeUnit(StarRocksParser.TimeUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#addPartitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddPartitionClause(StarRocksParser.AddPartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropPartitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropPartitionClause(StarRocksParser.DropPartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#truncatePartitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncatePartitionClause(StarRocksParser.TruncatePartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#modifyPartitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyPartitionClause(StarRocksParser.ModifyPartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#replacePartitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplacePartitionClause(StarRocksParser.ReplacePartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#partitionRenameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionRenameClause(StarRocksParser.PartitionRenameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(StarRocksParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#insertLabelOrColumnAliases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertLabelOrColumnAliases(StarRocksParser.InsertLabelOrColumnAliasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#updateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(StarRocksParser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(StarRocksParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createRoutineLoadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRoutineLoadStatement(StarRocksParser.CreateRoutineLoadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterRoutineLoadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRoutineLoadStatement(StarRocksParser.AlterRoutineLoadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dataSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSource(StarRocksParser.DataSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#loadProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadProperties(StarRocksParser.LoadPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#colSeparatorProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColSeparatorProperty(StarRocksParser.ColSeparatorPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#rowDelimiterProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowDelimiterProperty(StarRocksParser.RowDelimiterPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#importColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportColumns(StarRocksParser.ImportColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#columnProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnProperties(StarRocksParser.ColumnPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#jobProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobProperties(StarRocksParser.JobPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dataSourceProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSourceProperties(StarRocksParser.DataSourcePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#stopRoutineLoadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopRoutineLoadStatement(StarRocksParser.StopRoutineLoadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#resumeRoutineLoadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResumeRoutineLoadStatement(StarRocksParser.ResumeRoutineLoadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#pauseRoutineLoadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPauseRoutineLoadStatement(StarRocksParser.PauseRoutineLoadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showRoutineLoadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowRoutineLoadStatement(StarRocksParser.ShowRoutineLoadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showRoutineLoadTaskStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowRoutineLoadTaskStatement(StarRocksParser.ShowRoutineLoadTaskStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showCreateRoutineLoadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateRoutineLoadStatement(StarRocksParser.ShowCreateRoutineLoadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showStreamLoadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowStreamLoadStatement(StarRocksParser.ShowStreamLoadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#analyzeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeStatement(StarRocksParser.AnalyzeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropStatsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropStatsStatement(StarRocksParser.DropStatsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#histogramStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHistogramStatement(StarRocksParser.HistogramStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#analyzeHistogramStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeHistogramStatement(StarRocksParser.AnalyzeHistogramStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropHistogramStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropHistogramStatement(StarRocksParser.DropHistogramStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createAnalyzeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAnalyzeStatement(StarRocksParser.CreateAnalyzeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropAnalyzeJobStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropAnalyzeJobStatement(StarRocksParser.DropAnalyzeJobStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showAnalyzeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowAnalyzeStatement(StarRocksParser.ShowAnalyzeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showStatsMetaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowStatsMetaStatement(StarRocksParser.ShowStatsMetaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showHistogramMetaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowHistogramMetaStatement(StarRocksParser.ShowHistogramMetaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#killAnalyzeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKillAnalyzeStatement(StarRocksParser.KillAnalyzeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#analyzeProfileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeProfileStatement(StarRocksParser.AnalyzeProfileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createResourceGroupStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateResourceGroupStatement(StarRocksParser.CreateResourceGroupStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropResourceGroupStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropResourceGroupStatement(StarRocksParser.DropResourceGroupStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterResourceGroupStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterResourceGroupStatement(StarRocksParser.AlterResourceGroupStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showResourceGroupStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowResourceGroupStatement(StarRocksParser.ShowResourceGroupStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showResourceGroupUsageStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowResourceGroupUsageStatement(StarRocksParser.ShowResourceGroupUsageStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createResourceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateResourceStatement(StarRocksParser.CreateResourceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterResourceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterResourceStatement(StarRocksParser.AlterResourceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropResourceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropResourceStatement(StarRocksParser.DropResourceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showResourceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowResourceStatement(StarRocksParser.ShowResourceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#classifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassifier(StarRocksParser.ClassifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showFunctionsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctionsStatement(StarRocksParser.ShowFunctionsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunctionStatement(StarRocksParser.DropFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunctionStatement(StarRocksParser.CreateFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#inlineFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineFunction(StarRocksParser.InlineFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(StarRocksParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#loadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadStatement(StarRocksParser.LoadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#labelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelName(StarRocksParser.LabelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dataDescList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDescList(StarRocksParser.DataDescListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dataDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDesc(StarRocksParser.DataDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#formatProps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatProps(StarRocksParser.FormatPropsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#brokerDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrokerDesc(StarRocksParser.BrokerDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#resourceDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceDesc(StarRocksParser.ResourceDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showLoadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowLoadStatement(StarRocksParser.ShowLoadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showLoadWarningsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowLoadWarningsStatement(StarRocksParser.ShowLoadWarningsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#cancelLoadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancelLoadStatement(StarRocksParser.CancelLoadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterLoadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterLoadStatement(StarRocksParser.AlterLoadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#cancelCompactionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancelCompactionStatement(StarRocksParser.CancelCompactionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showAuthorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowAuthorStatement(StarRocksParser.ShowAuthorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showBackendsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowBackendsStatement(StarRocksParser.ShowBackendsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showBrokerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowBrokerStatement(StarRocksParser.ShowBrokerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showCharsetStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCharsetStatement(StarRocksParser.ShowCharsetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showCollationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCollationStatement(StarRocksParser.ShowCollationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showDeleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDeleteStatement(StarRocksParser.ShowDeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showDynamicPartitionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDynamicPartitionStatement(StarRocksParser.ShowDynamicPartitionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showEventsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowEventsStatement(StarRocksParser.ShowEventsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showEnginesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowEnginesStatement(StarRocksParser.ShowEnginesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showFrontendsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFrontendsStatement(StarRocksParser.ShowFrontendsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showPluginsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPluginsStatement(StarRocksParser.ShowPluginsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showRepositoriesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowRepositoriesStatement(StarRocksParser.ShowRepositoriesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showOpenTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowOpenTableStatement(StarRocksParser.ShowOpenTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showPrivilegesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPrivilegesStatement(StarRocksParser.ShowPrivilegesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showProcedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProcedureStatement(StarRocksParser.ShowProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showProcStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProcStatement(StarRocksParser.ShowProcStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showProcesslistStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProcesslistStatement(StarRocksParser.ShowProcesslistStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showProfilelistStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProfilelistStatement(StarRocksParser.ShowProfilelistStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showRunningQueriesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowRunningQueriesStatement(StarRocksParser.ShowRunningQueriesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showStatusStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowStatusStatement(StarRocksParser.ShowStatusStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showTabletStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTabletStatement(StarRocksParser.ShowTabletStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showTransactionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTransactionStatement(StarRocksParser.ShowTransactionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showTriggersStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTriggersStatement(StarRocksParser.ShowTriggersStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showUserPropertyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowUserPropertyStatement(StarRocksParser.ShowUserPropertyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showVariablesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowVariablesStatement(StarRocksParser.ShowVariablesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showWarningStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowWarningStatement(StarRocksParser.ShowWarningStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#helpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelpStatement(StarRocksParser.HelpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createUserStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserStatement(StarRocksParser.CreateUserStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropUserStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUserStatement(StarRocksParser.DropUserStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterUserStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserStatement(StarRocksParser.AlterUserStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showUserStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowUserStatement(StarRocksParser.ShowUserStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showAllAuthentication}
	 * labeled alternative in {@link StarRocksParser#showAuthenticationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowAllAuthentication(StarRocksParser.ShowAllAuthenticationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showAuthenticationForUser}
	 * labeled alternative in {@link StarRocksParser#showAuthenticationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowAuthenticationForUser(StarRocksParser.ShowAuthenticationForUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#executeAsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteAsStatement(StarRocksParser.ExecuteAsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createRoleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRoleStatement(StarRocksParser.CreateRoleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterRoleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRoleStatement(StarRocksParser.AlterRoleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropRoleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRoleStatement(StarRocksParser.DropRoleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showRolesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowRolesStatement(StarRocksParser.ShowRolesStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grantRoleToUser}
	 * labeled alternative in {@link StarRocksParser#grantRoleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantRoleToUser(StarRocksParser.GrantRoleToUserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grantRoleToRole}
	 * labeled alternative in {@link StarRocksParser#grantRoleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantRoleToRole(StarRocksParser.GrantRoleToRoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code revokeRoleFromUser}
	 * labeled alternative in {@link StarRocksParser#revokeRoleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeRoleFromUser(StarRocksParser.RevokeRoleFromUserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code revokeRoleFromRole}
	 * labeled alternative in {@link StarRocksParser#revokeRoleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeRoleFromRole(StarRocksParser.RevokeRoleFromRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#setRoleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetRoleStatement(StarRocksParser.SetRoleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#setDefaultRoleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDefaultRoleStatement(StarRocksParser.SetDefaultRoleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#grantRevokeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantRevokeClause(StarRocksParser.GrantRevokeClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grantOnUser}
	 * labeled alternative in {@link StarRocksParser#grantPrivilegeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantOnUser(StarRocksParser.GrantOnUserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grantOnTableBrief}
	 * labeled alternative in {@link StarRocksParser#grantPrivilegeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantOnTableBrief(StarRocksParser.GrantOnTableBriefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grantOnFunc}
	 * labeled alternative in {@link StarRocksParser#grantPrivilegeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantOnFunc(StarRocksParser.GrantOnFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grantOnSystem}
	 * labeled alternative in {@link StarRocksParser#grantPrivilegeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantOnSystem(StarRocksParser.GrantOnSystemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grantOnPrimaryObj}
	 * labeled alternative in {@link StarRocksParser#grantPrivilegeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantOnPrimaryObj(StarRocksParser.GrantOnPrimaryObjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grantOnAll}
	 * labeled alternative in {@link StarRocksParser#grantPrivilegeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantOnAll(StarRocksParser.GrantOnAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code revokeOnUser}
	 * labeled alternative in {@link StarRocksParser#revokePrivilegeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeOnUser(StarRocksParser.RevokeOnUserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code revokeOnTableBrief}
	 * labeled alternative in {@link StarRocksParser#revokePrivilegeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeOnTableBrief(StarRocksParser.RevokeOnTableBriefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code revokeOnFunc}
	 * labeled alternative in {@link StarRocksParser#revokePrivilegeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeOnFunc(StarRocksParser.RevokeOnFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code revokeOnSystem}
	 * labeled alternative in {@link StarRocksParser#revokePrivilegeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeOnSystem(StarRocksParser.RevokeOnSystemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code revokeOnPrimaryObj}
	 * labeled alternative in {@link StarRocksParser#revokePrivilegeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeOnPrimaryObj(StarRocksParser.RevokeOnPrimaryObjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code revokeOnAll}
	 * labeled alternative in {@link StarRocksParser#revokePrivilegeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeOnAll(StarRocksParser.RevokeOnAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showGrantsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowGrantsStatement(StarRocksParser.ShowGrantsStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code authWithoutPlugin}
	 * labeled alternative in {@link StarRocksParser#authOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthWithoutPlugin(StarRocksParser.AuthWithoutPluginContext ctx);
	/**
	 * Visit a parse tree produced by the {@code authWithPlugin}
	 * labeled alternative in {@link StarRocksParser#authOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthWithPlugin(StarRocksParser.AuthWithPluginContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#privObjectName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivObjectName(StarRocksParser.PrivObjectNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#privObjectNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivObjectNameList(StarRocksParser.PrivObjectNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#privFunctionObjectNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivFunctionObjectNameList(StarRocksParser.PrivFunctionObjectNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#privilegeTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeTypeList(StarRocksParser.PrivilegeTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#privilegeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeType(StarRocksParser.PrivilegeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#privObjectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivObjectType(StarRocksParser.PrivObjectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#privObjectTypePlural}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivObjectTypePlural(StarRocksParser.PrivObjectTypePluralContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#backupStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackupStatement(StarRocksParser.BackupStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#cancelBackupStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancelBackupStatement(StarRocksParser.CancelBackupStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showBackupStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowBackupStatement(StarRocksParser.ShowBackupStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#restoreStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestoreStatement(StarRocksParser.RestoreStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#cancelRestoreStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancelRestoreStatement(StarRocksParser.CancelRestoreStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showRestoreStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowRestoreStatement(StarRocksParser.ShowRestoreStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showSnapshotStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSnapshotStatement(StarRocksParser.ShowSnapshotStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createRepositoryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRepositoryStatement(StarRocksParser.CreateRepositoryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropRepositoryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRepositoryStatement(StarRocksParser.DropRepositoryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#addSqlBlackListStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSqlBlackListStatement(StarRocksParser.AddSqlBlackListStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#delSqlBlackListStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelSqlBlackListStatement(StarRocksParser.DelSqlBlackListStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showSqlBlackListStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSqlBlackListStatement(StarRocksParser.ShowSqlBlackListStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showWhiteListStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowWhiteListStatement(StarRocksParser.ShowWhiteListStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#addBackendBlackListStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddBackendBlackListStatement(StarRocksParser.AddBackendBlackListStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#delBackendBlackListStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelBackendBlackListStatement(StarRocksParser.DelBackendBlackListStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showBackendBlackListStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowBackendBlackListStatement(StarRocksParser.ShowBackendBlackListStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dataCacheTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataCacheTarget(StarRocksParser.DataCacheTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createDataCacheRuleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDataCacheRuleStatement(StarRocksParser.CreateDataCacheRuleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showDataCacheRulesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDataCacheRulesStatement(StarRocksParser.ShowDataCacheRulesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropDataCacheRuleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDataCacheRuleStatement(StarRocksParser.DropDataCacheRuleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#clearDataCacheRulesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearDataCacheRulesStatement(StarRocksParser.ClearDataCacheRulesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dataCacheSelectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataCacheSelectStatement(StarRocksParser.DataCacheSelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(StarRocksParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#cancelExportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancelExportStatement(StarRocksParser.CancelExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showExportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowExportStatement(StarRocksParser.ShowExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#installPluginStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstallPluginStatement(StarRocksParser.InstallPluginStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#uninstallPluginStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUninstallPluginStatement(StarRocksParser.UninstallPluginStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createFileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFileStatement(StarRocksParser.CreateFileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropFileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFileStatement(StarRocksParser.DropFileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showSmallFilesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSmallFilesStatement(StarRocksParser.ShowSmallFilesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createPipeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatePipeStatement(StarRocksParser.CreatePipeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropPipeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropPipeStatement(StarRocksParser.DropPipeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterPipeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterPipeClause(StarRocksParser.AlterPipeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterPipeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterPipeStatement(StarRocksParser.AlterPipeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#descPipeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescPipeStatement(StarRocksParser.DescPipeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showPipeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPipeStatement(StarRocksParser.ShowPipeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStatement(StarRocksParser.SetStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setNames}
	 * labeled alternative in {@link StarRocksParser#setVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetNames(StarRocksParser.SetNamesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setPassword}
	 * labeled alternative in {@link StarRocksParser#setVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetPassword(StarRocksParser.SetPasswordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setUserVar}
	 * labeled alternative in {@link StarRocksParser#setVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetUserVar(StarRocksParser.SetUserVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setSystemVar}
	 * labeled alternative in {@link StarRocksParser#setVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSystemVar(StarRocksParser.SetSystemVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link StarRocksParser#setVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTransaction(StarRocksParser.SetTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#transaction_characteristics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_characteristics(StarRocksParser.Transaction_characteristicsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#transaction_access_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_access_mode(StarRocksParser.Transaction_access_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#isolation_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolation_level(StarRocksParser.Isolation_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#isolation_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolation_types(StarRocksParser.Isolation_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#setExprOrDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExprOrDefault(StarRocksParser.SetExprOrDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#setUserPropertyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetUserPropertyStatement(StarRocksParser.SetUserPropertyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#roleList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleList(StarRocksParser.RoleListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#executeScriptStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteScriptStatement(StarRocksParser.ExecuteScriptStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsupportedStatement(StarRocksParser.UnsupportedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#lock_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_item(StarRocksParser.Lock_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#lock_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_type(StarRocksParser.Lock_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#addPlanAdvisorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddPlanAdvisorStatement(StarRocksParser.AddPlanAdvisorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#clearPlanAdvisorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearPlanAdvisorStatement(StarRocksParser.ClearPlanAdvisorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#delPlanAdvisorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelPlanAdvisorStatement(StarRocksParser.DelPlanAdvisorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showPlanAdvisorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPlanAdvisorStatement(StarRocksParser.ShowPlanAdvisorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#createWarehouseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateWarehouseStatement(StarRocksParser.CreateWarehouseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#dropWarehouseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropWarehouseStatement(StarRocksParser.DropWarehouseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#suspendWarehouseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuspendWarehouseStatement(StarRocksParser.SuspendWarehouseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#resumeWarehouseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResumeWarehouseStatement(StarRocksParser.ResumeWarehouseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#setWarehouseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetWarehouseStatement(StarRocksParser.SetWarehouseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showWarehousesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowWarehousesStatement(StarRocksParser.ShowWarehousesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showClustersStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowClustersStatement(StarRocksParser.ShowClustersStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#showNodesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowNodesStatement(StarRocksParser.ShowNodesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#alterWarehouseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterWarehouseStatement(StarRocksParser.AlterWarehouseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#queryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryStatement(StarRocksParser.QueryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#queryRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryRelation(StarRocksParser.QueryRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#withClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithClause(StarRocksParser.WithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryNoWith(StarRocksParser.QueryNoWithContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#queryPeriod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPeriod(StarRocksParser.QueryPeriodContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#periodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriodType(StarRocksParser.PeriodTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryWithParentheses}
	 * labeled alternative in {@link StarRocksParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryWithParentheses(StarRocksParser.QueryWithParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link StarRocksParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(StarRocksParser.SetOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link StarRocksParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(StarRocksParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(StarRocksParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#rowConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(StarRocksParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(StarRocksParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#limitElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitElement(StarRocksParser.LimitElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(StarRocksParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code from}
	 * labeled alternative in {@link StarRocksParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(StarRocksParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dual}
	 * labeled alternative in {@link StarRocksParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDual(StarRocksParser.DualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rollup}
	 * labeled alternative in {@link StarRocksParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollup(StarRocksParser.RollupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cube}
	 * labeled alternative in {@link StarRocksParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCube(StarRocksParser.CubeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleGroupingSets}
	 * labeled alternative in {@link StarRocksParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleGroupingSets(StarRocksParser.MultipleGroupingSetsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleGroupingSet}
	 * labeled alternative in {@link StarRocksParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleGroupingSet(StarRocksParser.SingleGroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(StarRocksParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#commonTableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonTableExpression(StarRocksParser.CommonTableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(StarRocksParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link StarRocksParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSingle(StarRocksParser.SelectSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link StarRocksParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAll(StarRocksParser.SelectAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#relations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelations(StarRocksParser.RelationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(StarRocksParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableAtom}
	 * labeled alternative in {@link StarRocksParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAtom(StarRocksParser.TableAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTable}
	 * labeled alternative in {@link StarRocksParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(StarRocksParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryWithAlias}
	 * labeled alternative in {@link StarRocksParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryWithAlias(StarRocksParser.SubqueryWithAliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFunction}
	 * labeled alternative in {@link StarRocksParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFunction(StarRocksParser.TableFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalizedTableFunction}
	 * labeled alternative in {@link StarRocksParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalizedTableFunction(StarRocksParser.NormalizedTableFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fileTableFunction}
	 * labeled alternative in {@link StarRocksParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileTableFunction(StarRocksParser.FileTableFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedRelation}
	 * labeled alternative in {@link StarRocksParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedRelation(StarRocksParser.ParenthesizedRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#pivotClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotClause(StarRocksParser.PivotClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#pivotAggregationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotAggregationExpression(StarRocksParser.PivotAggregationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#pivotValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotValue(StarRocksParser.PivotValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#sampleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleClause(StarRocksParser.SampleClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(StarRocksParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#namedArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgumentList(StarRocksParser.NamedArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namedArguments}
	 * labeled alternative in {@link StarRocksParser#namedArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArguments(StarRocksParser.NamedArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#joinRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(StarRocksParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#crossOrInnerJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossOrInnerJoinType(StarRocksParser.CrossOrInnerJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#outerAndSemiJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuterAndSemiJoinType(StarRocksParser.OuterAndSemiJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#bracketHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketHint(StarRocksParser.BracketHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#hintMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHintMap(StarRocksParser.HintMapContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(StarRocksParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#columnAliases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAliases(StarRocksParser.ColumnAliasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#partitionNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionNames(StarRocksParser.PartitionNamesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code keyPartitionList}
	 * labeled alternative in {@link StarRocksParser#keyPartitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyPartitionList(StarRocksParser.KeyPartitionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#tabletList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabletList(StarRocksParser.TabletListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#prepareStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepareStatement(StarRocksParser.PrepareStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#prepareSql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepareSql(StarRocksParser.PrepareSqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#executeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteStatement(StarRocksParser.ExecuteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#deallocateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocateStatement(StarRocksParser.DeallocateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#replicaList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplicaList(StarRocksParser.ReplicaListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#expressionsWithDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionsWithDefault(StarRocksParser.ExpressionsWithDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#expressionOrDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOrDefault(StarRocksParser.ExpressionOrDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#mapExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExpressionList(StarRocksParser.MapExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#mapExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExpression(StarRocksParser.MapExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#expressionSingleton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSingleton(StarRocksParser.ExpressionSingletonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionDefault}
	 * labeled alternative in {@link StarRocksParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionDefault(StarRocksParser.ExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link StarRocksParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(StarRocksParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link StarRocksParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(StarRocksParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(StarRocksParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link StarRocksParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(StarRocksParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpressionDefault}
	 * labeled alternative in {@link StarRocksParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpressionDefault(StarRocksParser.BooleanExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isNull}
	 * labeled alternative in {@link StarRocksParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNull(StarRocksParser.IsNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scalarSubquery}
	 * labeled alternative in {@link StarRocksParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarSubquery(StarRocksParser.ScalarSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(StarRocksParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#tupleInSubquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleInSubquery(StarRocksParser.TupleInSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link StarRocksParser#predicateOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInSubquery(StarRocksParser.InSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inList}
	 * labeled alternative in {@link StarRocksParser#predicateOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInList(StarRocksParser.InListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code between}
	 * labeled alternative in {@link StarRocksParser#predicateOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween(StarRocksParser.BetweenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code like}
	 * labeled alternative in {@link StarRocksParser#predicateOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike(StarRocksParser.LikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link StarRocksParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(StarRocksParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link StarRocksParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(StarRocksParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(StarRocksParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code odbcFunctionCallExpression}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdbcFunctionCallExpression(StarRocksParser.OdbcFunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code matchExpr}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchExpr(StarRocksParser.MatchExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnRef}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnRef(StarRocksParser.ColumnRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code convert}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvert(StarRocksParser.ConvertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collectionSubscript}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionSubscript(StarRocksParser.CollectionSubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(StarRocksParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(StarRocksParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(StarRocksParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code userVariableExpression}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserVariableExpression(StarRocksParser.UserVariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(StarRocksParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(StarRocksParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowExpression}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowExpression(StarRocksParser.ArrowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code systemVariableExpression}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemVariableExpression(StarRocksParser.SystemVariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concat}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(StarRocksParser.ConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(StarRocksParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaFunctionExpr}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaFunctionExpr(StarRocksParser.LambdaFunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dictionaryGetExpr}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryGetExpr(StarRocksParser.DictionaryGetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collate}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollate(StarRocksParser.CollateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayConstructor}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayConstructor(StarRocksParser.ArrayConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapConstructor}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapConstructor(StarRocksParser.MapConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arraySlice}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySlice(StarRocksParser.ArraySliceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(StarRocksParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(StarRocksParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link StarRocksParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(StarRocksParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link StarRocksParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(StarRocksParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link StarRocksParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(StarRocksParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link StarRocksParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(StarRocksParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dateLiteral}
	 * labeled alternative in {@link StarRocksParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateLiteral(StarRocksParser.DateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link StarRocksParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(StarRocksParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link StarRocksParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalLiteral(StarRocksParser.IntervalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unitBoundaryLiteral}
	 * labeled alternative in {@link StarRocksParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitBoundaryLiteral(StarRocksParser.UnitBoundaryLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryLiteral}
	 * labeled alternative in {@link StarRocksParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLiteral(StarRocksParser.BinaryLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parameter}
	 * labeled alternative in {@link StarRocksParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(StarRocksParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link StarRocksParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract(StarRocksParser.ExtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupingOperation}
	 * labeled alternative in {@link StarRocksParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingOperation(StarRocksParser.GroupingOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code informationFunction}
	 * labeled alternative in {@link StarRocksParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInformationFunction(StarRocksParser.InformationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specialDateTime}
	 * labeled alternative in {@link StarRocksParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialDateTime(StarRocksParser.SpecialDateTimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specialFunction}
	 * labeled alternative in {@link StarRocksParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialFunction(StarRocksParser.SpecialFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggregationFunctionCall}
	 * labeled alternative in {@link StarRocksParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunctionCall(StarRocksParser.AggregationFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowFunctionCall}
	 * labeled alternative in {@link StarRocksParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFunctionCall(StarRocksParser.WindowFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link StarRocksParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFunctionCall(StarRocksParser.SimpleFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(StarRocksParser.AggregationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#userVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserVariable(StarRocksParser.UserVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#systemVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemVariable(StarRocksParser.SystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#columnReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(StarRocksParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#informationFunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInformationFunctionExpression(StarRocksParser.InformationFunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#specialDateTimeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialDateTimeExpression(StarRocksParser.SpecialDateTimeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#specialFunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialFunctionExpression(StarRocksParser.SpecialFunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#windowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFunction(StarRocksParser.WindowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(StarRocksParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#over}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver(StarRocksParser.OverContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#ignoreNulls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreNulls(StarRocksParser.IgnoreNullsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(StarRocksParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unboundedFrame}
	 * labeled alternative in {@link StarRocksParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnboundedFrame(StarRocksParser.UnboundedFrameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentRowBound}
	 * labeled alternative in {@link StarRocksParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentRowBound(StarRocksParser.CurrentRowBoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boundedFrame}
	 * labeled alternative in {@link StarRocksParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundedFrame(StarRocksParser.BoundedFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#backupRestoreObjectDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackupRestoreObjectDesc(StarRocksParser.BackupRestoreObjectDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#tableDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableDesc(StarRocksParser.TableDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#backupRestoreTableDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackupRestoreTableDesc(StarRocksParser.BackupRestoreTableDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#explainDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainDesc(StarRocksParser.ExplainDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#optimizerTrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimizerTrace(StarRocksParser.OptimizerTraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#partitionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionExpr(StarRocksParser.PartitionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#partitionDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionDesc(StarRocksParser.PartitionDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#listPartitionDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListPartitionDesc(StarRocksParser.ListPartitionDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#singleItemListPartitionDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleItemListPartitionDesc(StarRocksParser.SingleItemListPartitionDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#multiItemListPartitionDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiItemListPartitionDesc(StarRocksParser.MultiItemListPartitionDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#multiListPartitionValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiListPartitionValues(StarRocksParser.MultiListPartitionValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#singleListPartitionValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleListPartitionValues(StarRocksParser.SingleListPartitionValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#listPartitionValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListPartitionValues(StarRocksParser.ListPartitionValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#listPartitionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListPartitionValue(StarRocksParser.ListPartitionValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#stringList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringList(StarRocksParser.StringListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#literalExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpressionList(StarRocksParser.LiteralExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#rangePartitionDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangePartitionDesc(StarRocksParser.RangePartitionDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#singleRangePartition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleRangePartition(StarRocksParser.SingleRangePartitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#multiRangePartition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiRangePartition(StarRocksParser.MultiRangePartitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#partitionRangeDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionRangeDesc(StarRocksParser.PartitionRangeDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#partitionKeyDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionKeyDesc(StarRocksParser.PartitionKeyDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#partitionValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionValueList(StarRocksParser.PartitionValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#keyPartition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyPartition(StarRocksParser.KeyPartitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#partitionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionValue(StarRocksParser.PartitionValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#distributionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistributionClause(StarRocksParser.DistributionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#distributionDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistributionDesc(StarRocksParser.DistributionDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#refreshSchemeDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshSchemeDesc(StarRocksParser.RefreshSchemeDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#statusDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatusDesc(StarRocksParser.StatusDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(StarRocksParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#extProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtProperties(StarRocksParser.ExtPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#propertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyList(StarRocksParser.PropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#userPropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserPropertyList(StarRocksParser.UserPropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(StarRocksParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#inlineProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineProperties(StarRocksParser.InlinePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#inlineProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineProperty(StarRocksParser.InlinePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(StarRocksParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(StarRocksParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#outfile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutfile(StarRocksParser.OutfileContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileFormat(StarRocksParser.FileFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(StarRocksParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(StarRocksParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(StarRocksParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(StarRocksParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(StarRocksParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#taskInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaskInterval(StarRocksParser.TaskIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#taskUnitIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaskUnitIdentifier(StarRocksParser.TaskUnitIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#unitIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitIdentifier(StarRocksParser.UnitIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#unitBoundary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitBoundary(StarRocksParser.UnitBoundaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(StarRocksParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(StarRocksParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#mapType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapType(StarRocksParser.MapTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#subfieldDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubfieldDesc(StarRocksParser.SubfieldDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#subfieldDescs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubfieldDescs(StarRocksParser.SubfieldDescsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#structType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructType(StarRocksParser.StructTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(StarRocksParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(StarRocksParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#decimalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalType(StarRocksParser.DecimalTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(StarRocksParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#writeBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteBranch(StarRocksParser.WriteBranchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link StarRocksParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(StarRocksParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code digitIdentifier}
	 * labeled alternative in {@link StarRocksParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitIdentifier(StarRocksParser.DigitIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code backQuotedIdentifier}
	 * labeled alternative in {@link StarRocksParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackQuotedIdentifier(StarRocksParser.BackQuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#identifierWithAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierWithAlias(StarRocksParser.IdentifierWithAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#identifierWithAliasList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierWithAliasList(StarRocksParser.IdentifierWithAliasListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(StarRocksParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#identifierOrString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierOrString(StarRocksParser.IdentifierOrStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#identifierOrStringList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierOrStringList(StarRocksParser.IdentifierOrStringListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#identifierOrStringOrStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierOrStringOrStar(StarRocksParser.IdentifierOrStringOrStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code userWithoutHost}
	 * labeled alternative in {@link StarRocksParser#user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserWithoutHost(StarRocksParser.UserWithoutHostContext ctx);
	/**
	 * Visit a parse tree produced by the {@code userWithHost}
	 * labeled alternative in {@link StarRocksParser#user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserWithHost(StarRocksParser.UserWithHostContext ctx);
	/**
	 * Visit a parse tree produced by the {@code userWithHostAndBlanket}
	 * labeled alternative in {@link StarRocksParser#user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserWithHostAndBlanket(StarRocksParser.UserWithHostAndBlanketContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(StarRocksParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(StarRocksParser.AssignmentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalValue}
	 * labeled alternative in {@link StarRocksParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalValue(StarRocksParser.DecimalValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleValue}
	 * labeled alternative in {@link StarRocksParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleValue(StarRocksParser.DoubleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerValue}
	 * labeled alternative in {@link StarRocksParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerValue(StarRocksParser.IntegerValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarRocksParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(StarRocksParser.NonReservedContext ctx);
}