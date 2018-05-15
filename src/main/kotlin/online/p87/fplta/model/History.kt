package online.p87.fplta.model


class History (
    val id: Int,
    val movement: String,
    val points: Int,
    val total_points: Int,
    val rank: Int,
    val rank_sort: Int,
    val overall_rank: Int,
    val targets: String?,
    val event_transfers: Int,
    val event_transfers_cost: Int,
    val value: Int,
    val points_on_bench: Int,
    val bank: Int,
    val entry: Int,
    val event: Int
)
