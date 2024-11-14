package solution

object DirReduction {
    fun dirReduc(arr: Array<String>): Array<String> {

        val routeNotOptimized = arr.toList()

        val unnecessaryNorthSouth = listOf("NORTH", "SOUTH")
        val unnecessarySouthNorth = listOf("SOUTH", "NORTH")
        val unnecessaryWestEast = listOf("WEST", "EAST")
        val unnecessaryEastWest = listOf("EAST", "WEST")


        var optimizedRoute = optimizeDirection(routeNotOptimized, unnecessaryNorthSouth)

        var beforeOptimization = optimizedRoute
        var afterOptimization = emptyList<String>()

        while (beforeOptimization != afterOptimization) {

            beforeOptimization = afterOptimization

            optimizedRoute = optimizeDirection(optimizedRoute, unnecessaryNorthSouth)
            optimizedRoute = optimizeDirection(optimizedRoute, unnecessarySouthNorth)
            optimizedRoute = optimizeDirection(optimizedRoute, unnecessaryWestEast)
            optimizedRoute = optimizeDirection(optimizedRoute, unnecessaryEastWest)

            afterOptimization = optimizedRoute
        }


        return optimizedRoute.toTypedArray()
    }

    fun optimizeDirection(notOptimizedRoute: List<String>, unnecessaryRoute: List<String>): List<String> {

        val optimizationsRouteResult = notOptimizedRoute.toMutableList()
        var directionIndex = 0

        while (directionIndex <= optimizationsRouteResult.size - unnecessaryRoute.size) {

            if (optimizationsRouteResult.subList(directionIndex, directionIndex + unnecessaryRoute.size) == unnecessaryRoute) {
                for (direction in unnecessaryRoute.indices) {
                    optimizationsRouteResult.removeAt(directionIndex)
                }

            } else {
                directionIndex++
            }
        }

        return optimizationsRouteResult
    }

}