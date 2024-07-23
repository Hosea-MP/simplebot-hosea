Pathing   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Pathing"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10,"i7":10,"i8":10,"i9":10,"i10":10,"i11":10,"i12":10,"i13":10,"i14":10,"i15":10,"i16":10,"i17":10,"i18":10,"i19":10,"i20":10,"i21":10,"i22":10,"i23":10,"i24":10,"i25":10,"i26":10,"i27":10,"i28":10,"i29":10,"i30":10,"i31":10,"i32":10,"i33":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Pathing.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/Paintable.html "interface in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/PortalTeleports.html "class in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Pathing.html)
*   [No Frames](Pathing.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   Field | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)

simple.hooks.simplebot

Class Pathing
-------------

*   java.lang.Object
*   *   simple.hooks.simplebot.Pathing

*   * * *
    
      
    
    public class Pathing
    extends java.lang.Object
    

*   *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[Pathing](../../../simple/hooks/simplebot/Pathing.html#Pathing-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        `[clickSceneTile](../../../simple/hooks/simplebot/Pathing.html#clickSceneTile-net.runelite.api.coords.WorldPoint-boolean-boolean-)(net.runelite.api.coords.WorldPoint worldPoint, boolean rightClick, boolean turnTo)`
        
        Will attempt to walk to a tile in-game by clicking on it and not via the minimap
        
        `double`
        
        `[collisionDistance](../../../simple/hooks/simplebot/Pathing.html#collisionDistance-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable)`
        
        Will return the collision collisionDistance to said locatable from players location
        
        `int`
        
        `[collisionDistance](../../../simple/hooks/simplebot/Pathing.html#collisionDistance-simple.hooks.interfaces.SimpleLocatable-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable1, [SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable2)` 
        
        `double`
        
        `[collisionDistance](../../../simple/hooks/simplebot/Pathing.html#collisionDistance-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint locTo)`
        
        Will return the collision collisionDistance to said point {locTo} from players location
        
        `int`
        
        `[collisionDistance](../../../simple/hooks/simplebot/Pathing.html#collisionDistance-net.runelite.api.coords.WorldPoint-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint w1, net.runelite.api.coords.WorldPoint w2)` 
        
        `[WorldArea](../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils")`
        
        `[createArea](../../../simple/hooks/simplebot/Pathing.html#createArea-net.runelite.api.coords.WorldPoint...-)(net.runelite.api.coords.WorldPoint... points)`
        
        Returns a new worldarea created from an array of points in a polygonal style
        
        `[WorldArea](../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils")`
        
        `[createArea](../../../simple/hooks/simplebot/Pathing.html#createArea-net.runelite.api.coords.WorldPoint-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint point1, net.runelite.api.coords.WorldPoint point2)`
        
        Returns a new worldarea created from 2 points in a rectangular style
        
        `net.runelite.api.coords.WorldPoint[]`
        
        `[createLocalPath](../../../simple/hooks/simplebot/Pathing.html#createLocalPath-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint point)`
        
        will create a path from your tile to the specified tile using path finding, if a path can't be created an empty array WorldPoint\[\] will be returned
        
        `net.runelite.api.coords.WorldPoint`
        
        `[destination](../../../simple/hooks/simplebot/Pathing.html#destination--)()`
        
        will return if your client has a destination that its walking to otherwise it will return {null}
        
        `double`
        
        `[distanceTo](../../../simple/hooks/simplebot/Pathing.html#distanceTo-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint to)` 
        
        `double`
        
        `[distanceTo](../../../simple/hooks/simplebot/Pathing.html#distanceTo-net.runelite.api.coords.WorldPoint-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint from, net.runelite.api.coords.WorldPoint to)` 
        
        `double`
        
        `[distanceTo2D](../../../simple/hooks/simplebot/Pathing.html#distanceTo2D-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint to)` 
        
        `double`
        
        `[distanceTo2D](../../../simple/hooks/simplebot/Pathing.html#distanceTo2D-net.runelite.api.coords.WorldPoint-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint from, net.runelite.api.coords.WorldPoint to)` 
        
        `int`
        
        `[energyLevel](../../../simple/hooks/simplebot/Pathing.html#energyLevel--)()`
        
        will return how much run energy you have
        
        `net.runelite.api.Point`
        
        `[getMinimapPointForCoord](../../../simple/hooks/simplebot/Pathing.html#getMinimapPointForCoord-int-int-)(int x, int y)`
        
        will return the canvas location in the minimap for the x,y param
        
        `boolean`
        
        `[inArea](../../../simple/hooks/simplebot/Pathing.html#inArea-int-int-int-int-)(int fromX, int fromY, int toX, int toY)` 
        
        `boolean`
        
        `[inArea](../../../simple/hooks/simplebot/Pathing.html#inArea-simple.robot.utils.WorldArea-)([WorldArea](../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") area)`
        
        Will return {true} if the local player is inside of {area}, false otherwise
        
        `boolean`
        
        `[inArea](../../../simple/hooks/simplebot/Pathing.html#inArea-simple.robot.utils.WorldArea-net.runelite.api.coords.WorldPoint-)([WorldArea](../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") area, net.runelite.api.coords.WorldPoint point)`
        
        Will return {true} if the {point} is inside of {area}, false otherwise
        
        `boolean`
        
        `[inMotion](../../../simple/hooks/simplebot/Pathing.html#inMotion--)()` 
        
        `net.runelite.api.coords.WorldPoint`
        
        `[nextPathTile](../../../simple/hooks/simplebot/Pathing.html#nextPathTile-net.runelite.api.coords.WorldPoint:A-)(net.runelite.api.coords.WorldPoint[] path)`
        
        will return the next WorldPoint that should be walked to along your specified path.
        
        `boolean`
        
        `[onTile](../../../simple/hooks/simplebot/Pathing.html#onTile-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable)` 
        
        `boolean`
        
        `[onTile](../../../simple/hooks/simplebot/Pathing.html#onTile-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint point)` 
        
        `int`
        
        `[plane](../../../simple/hooks/simplebot/Pathing.html#plane--)()` 
        
        `boolean`
        
        `[pointOnMap](../../../simple/hooks/simplebot/Pathing.html#pointOnMap-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint p)` 
        
        `boolean`
        
        `[reachable](../../../simple/hooks/simplebot/Pathing.html#reachable-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable)`
        
        will return {true} if the specified tile is not blocked and will return {false} if it is.
        
        `boolean`
        
        `[reachable](../../../simple/hooks/simplebot/Pathing.html#reachable-simple.hooks.interfaces.SimpleLocatable-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable1, [SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable2)`
        
        will return whether or not point1 can reach point2
        
        `boolean`
        
        `[reachable](../../../simple/hooks/simplebot/Pathing.html#reachable-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint locTo)`
        
        will return {true} if the specified tile is not blocked and will return {false} if it is.
        
        `boolean`
        
        `[reachable](../../../simple/hooks/simplebot/Pathing.html#reachable-net.runelite.api.coords.WorldPoint-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint point1, net.runelite.api.coords.WorldPoint point2)`
        
        will return whether or not point1 can reach point2
        
        `boolean`
        
        `[running](../../../simple/hooks/simplebot/Pathing.html#running--)()`
        
        will return if you have run toggled on or off
        
        `boolean`
        
        `[running](../../../simple/hooks/simplebot/Pathing.html#running-boolean-)(boolean run)`
        
        will attempt to toggle run on/off based on {toggleRun}.
        
        `boolean`
        
        `[step](../../../simple/hooks/simplebot/Pathing.html#step-int-int-)(int x, int y)`
        
        will attempt to walk to the specified x,y coordinate.
        
        `boolean`
        
        `[step](../../../simple/hooks/simplebot/Pathing.html#step-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint point)`
        
        will attempt to walk to the specified point
        
        `boolean`
        
        `[walkPath](../../../simple/hooks/simplebot/Pathing.html#walkPath-net.runelite.api.coords.WorldPoint:A-)(net.runelite.api.coords.WorldPoint[] path)`
        
        will attempt to walk the specified path of tiles.
        
        `boolean`
        
        `[walkPath](../../../simple/hooks/simplebot/Pathing.html#walkPath-net.runelite.api.coords.WorldPoint:A-boolean-)(net.runelite.api.coords.WorldPoint[] path, boolean reverse)`
        
        will attempt to walk the specified path of tiles in reverse if specified true.
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Constructor Detail
        
        *   #### Pathing
            
            public Pathing([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)
            
    
    *   ### Method Detail
        
        *   #### plane
            
            public int plane()
            
        
        *   #### createArea
            
            public [WorldArea](../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") createArea(net.runelite.api.coords.WorldPoint point1,
                                        net.runelite.api.coords.WorldPoint point2)
            
            Returns a new worldarea created from 2 points in a rectangular style
            
            Parameters:
            
            `point1` -
            
            `point2` -
            
            Returns:
            
        
        *   #### createArea
            
            public [WorldArea](../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") createArea(net.runelite.api.coords.WorldPoint... points)
            
            Returns a new worldarea created from an array of points in a polygonal style
            
            Parameters:
            
            `points` -
            
            Returns:
            
        
        *   #### inArea
            
            public boolean inArea([WorldArea](../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") area)
            
            Will return {true} if the local player is inside of {area}, false otherwise
            
            Parameters:
            
            `area` -
            
            Returns:
            
        
        *   #### inArea
            
            public boolean inArea([WorldArea](../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") area,
                                  net.runelite.api.coords.WorldPoint point)
            
            Will return {true} if the {point} is inside of {area}, false otherwise
            
            Parameters:
            
            `area` -
            
            Returns:
            
        
        *   #### inArea
            
            public boolean inArea(int fromX,
                                  int fromY,
                                  int toX,
                                  int toY)
            
        
        *   #### onTile
            
            public boolean onTile(net.runelite.api.coords.WorldPoint point)
            
        
        *   #### onTile
            
            public boolean onTile([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable)
            
        
        *   #### getMinimapPointForCoord
            
            public net.runelite.api.Point getMinimapPointForCoord(int x,
                                                                  int y)
            
            will return the canvas location in the minimap for the x,y param
            
            Parameters:
            
            `x` -
            
            `y` -
            
            Returns:
            
        
        *   #### destination
            
            public net.runelite.api.coords.WorldPoint destination()
            
            will return if your client has a destination that its walking to otherwise it will return {null}
            
            Returns:
            
        
        *   #### running
            
            public boolean running()
            
            will return if you have run toggled on or off
            
            Returns:
            
        
        *   #### running
            
            public boolean running(boolean run)
            
            will attempt to toggle run on/off based on {toggleRun}. Will return type: {boolean} if the switch has been made to {toggleRun}
            
            Parameters:
            
            `run` -
            
            Returns:
            
        
        *   #### energyLevel
            
            public int energyLevel()
            
            will return how much run energy you have
            
            Returns:
            
        
        *   #### step
            
            public boolean step(int x,
                                int y)
            
            will attempt to walk to the specified x,y coordinate. Will use players current plane for Z axis
            
            Parameters:
            
            `x` -
            
            `y` -
            
            Returns:
            
        
        *   #### step
            
            public boolean step(net.runelite.api.coords.WorldPoint point)
            
            will attempt to walk to the specified point
            
            Parameters:
            
            `point` -
            
            Returns:
            
            \- if the point has been clicked on
            
        
        *   #### distanceTo
            
            public double distanceTo(net.runelite.api.coords.WorldPoint to)
            
        
        *   #### distanceTo
            
            public double distanceTo(net.runelite.api.coords.WorldPoint from,
                                     net.runelite.api.coords.WorldPoint to)
            
        
        *   #### distanceTo2D
            
            public double distanceTo2D(net.runelite.api.coords.WorldPoint to)
            
        
        *   #### distanceTo2D
            
            public double distanceTo2D(net.runelite.api.coords.WorldPoint from,
                                       net.runelite.api.coords.WorldPoint to)
            
        
        *   #### collisionDistance
            
            public double collisionDistance(net.runelite.api.coords.WorldPoint locTo)
            
            Will return the collision collisionDistance to said point {locTo} from players location
            
            Parameters:
            
            `locTo` -
            
            Returns:
            
        
        *   #### collisionDistance
            
            public double collisionDistance([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable)
            
            Will return the collision collisionDistance to said locatable from players location
            
            Parameters:
            
            `locatable` -
            
            Returns:
            
        
        *   #### reachable
            
            public boolean reachable([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable)
            
            will return {true} if the specified tile is not blocked and will return {false} if it is. Meaning if your player can actually reach the tile or not. (Handles all collisions)
            
            Parameters:
            
            `locatable` -
            
            Returns:
            
        
        *   #### reachable
            
            public boolean reachable(net.runelite.api.coords.WorldPoint locTo)
            
            will return {true} if the specified tile is not blocked and will return {false} if it is. Meaning if your player can actually reach the tile or not. (Handles all collisions)
            
            Parameters:
            
            `locTo` -
            
            Returns:
            
        
        *   #### reachable
            
            public boolean reachable(net.runelite.api.coords.WorldPoint point1,
                                     net.runelite.api.coords.WorldPoint point2)
            
            will return whether or not point1 can reach point2
            
            Parameters:
            
            `point1` -
            
            `point2` -
            
            Returns:
            
        
        *   #### reachable
            
            public boolean reachable([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable1,
                                     [SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable2)
            
            will return whether or not point1 can reach point2
            
            Parameters:
            
            `locatable1` -
            
            `locatable2` -
            
            Returns:
            
        
        *   #### collisionDistance
            
            public int collisionDistance([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable1,
                                         [SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable2)
            
            Parameters:
            
            `locatable1` -
            
            `locatable2` -
            
            Returns:
            
        
        *   #### collisionDistance
            
            public int collisionDistance(net.runelite.api.coords.WorldPoint w1,
                                         net.runelite.api.coords.WorldPoint w2)
            
            Parameters:
            
            `w1` -
            
            `w2` -
            
            Returns:
            
        
        *   #### createLocalPath
            
            public net.runelite.api.coords.WorldPoint\[\] createLocalPath(net.runelite.api.coords.WorldPoint point)
            
            will create a path from your tile to the specified tile using path finding, if a path can't be created an empty array WorldPoint\[\] will be returned
            
            Parameters:
            
            `point` - the point to create a path to
            
            Returns:
            
            an array of WorldPoints a.k.a your path
            
        
        *   #### walkPath
            
            public boolean walkPath(net.runelite.api.coords.WorldPoint\[\] path)
            
            will attempt to walk the specified path of tiles. It will handle all of clicking for you
            
            Parameters:
            
            `path` - - the tile path to walk
            
            Returns:
            
            \- {true} if the next tile in the path has been clicked on, {false} otherwise
            
        
        *   #### walkPath
            
            public boolean walkPath(net.runelite.api.coords.WorldPoint\[\] path,
                                    boolean reverse)
            
            will attempt to walk the specified path of tiles in reverse if specified true.
            
            Parameters:
            
            `path` - - the tile path to walk
            
            `reverse` - - if the path should be reversed
            
            Returns:
            
            \- {true} if the next tile in the path has been clicked on, {false} otherwise
            
        
        *   #### nextPathTile
            
            public net.runelite.api.coords.WorldPoint nextPathTile(net.runelite.api.coords.WorldPoint\[\] path)
            
            will return the next WorldPoint that should be walked to along your specified path. if there is no valid tile the first tile in the path will be returned
            
            Parameters:
            
            `path` - the path to search
            
            Returns:
            
            the next tile that should be walked to
            
        
        *   #### pointOnMap
            
            public boolean pointOnMap(net.runelite.api.coords.WorldPoint p)
            
        
        *   #### clickSceneTile
            
            public boolean clickSceneTile(net.runelite.api.coords.WorldPoint worldPoint,
                                          boolean rightClick,
                                          boolean turnTo)
            
            Will attempt to walk to a tile in-game by clicking on it and not via the minimap
            
            Parameters:
            
            `worldPoint` - - World tile to right click walk-here to
            
            `rightClick` - whether or not the bot should right click walk to the tile or left click walk if `rightClick`\=false
            
            `turnTo` - if the bot should use the camera to turn to the tile if it is not currently in the viewport/visible
            
            Returns:
            
            returns if the tile has been clicked on or not
            
        
        *   #### inMotion
            
            public boolean inMotion()
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Pathing.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/Paintable.html "interface in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/PortalTeleports.html "class in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Pathing.html)
*   [No Frames](Pathing.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   Field | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)