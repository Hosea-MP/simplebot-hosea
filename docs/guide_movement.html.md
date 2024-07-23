   :root { --c-bg: #fff; } html.dark { --c-bg: #22272e; } html, body { background-color: var(--c-bg); } const userMode = localStorage.getItem('vuepress-color-scheme') const systemDarkMode = window.matchMedia && window.matchMedia('(prefers-color-scheme: dark)').matches if (userMode === 'dark' || (userMode !== 'light' && systemDarkMode)) { document.documentElement.classList.toggle('dark', true) } Walking and Movement | SimpleBot Docs    .medium-zoom-overlay{position:fixed;top:0;right:0;bottom:0;left:0;opacity:0;transition:opacity .3s;will-change:opacity}.medium-zoom--opened .medium-zoom-overlay{cursor:pointer;cursor:zoom-out;opacity:1}.medium-zoom-image{cursor:pointer;cursor:zoom-in;transition:transform .3s cubic-bezier(.2,0,.2,1)!important}.medium-zoom-image--hidden{visibility:hidden}.medium-zoom-image--opened{position:relative;cursor:pointer;cursor:zoom-out;will-change:transform}

[![SimpleBot Docs](/docs-api/assets/sb-logo.png)SimpleBot Docs](/docs-api/)

[Home](/docs-api/)

[Guide](/docs-api/guide/)

[Javadocs open in new window](https://simplebot.org/docs/)

[SimpleBot open in new window](https://simplebot.org/)

Search

⌃K

[Home](/docs-api/)

[Guide](/docs-api/guide/)

[Javadocs open in new window](https://simplebot.org/docs/)

[SimpleBot open in new window](https://simplebot.org/)

*   Guide
    
    *   [SimpleBot RuneLite API Documentation](/docs-api/guide/)
    *   [Query API](/docs-api/guide/query.html)
    *   [Interacting with NPCs](/docs-api/guide/npcs.html)
    *   [Interacting with Objects](/docs-api/guide/objects.html)
    *   [Interacting with Items and Inventory](/docs-api/guide/items.html)
    *   [Working with Widgets](/docs-api/guide/widgets.html)
    *   [Walking and Movement](/docs-api/guide/movement.html)
        *   [Distance & Accessibility](#distance-accessibility)
        *   [Navigating](#navigating)
    *   [Implementing Sleep Conditions and Delays](/docs-api/guide/sleeps-delays.html)
    *   [Best Practices](/docs-api/guide/best-practices.html)
    *   [Examples](/docs-api/guide/examples.html)

[Walking and Movement](#walking-and-movement)
=============================================

Pathing is a comprehensive component of in-game navigation, encompassing the preparation, validation, and execution of movement across the game world. Within pathing systems, you can:

*   **Prepare** your route by plotting a course to your destination.
*   **Validate** the route to ensure it is navigable and free of obstacles.
*   **Navigate** by executing the planned movements step by step.

Alongside these core functionalities, pathing systems often provide additional features to enhance navigation:

*   **Run/Walk Toggle:** Decide whether your character should run to save time or walk to conserve resources like stamina.
*   **Motion Status:** Check if your player is currently moving, allowing dynamic response to gameplay.
*   **Current Target:** Access information about your character's intended destination or intermediate point. These tools within the pathing framework are essential for creating an efficient and immersive experience, enabling players to traverse the game environment with precision and intention.

### [Distance & Accessibility](#distance-accessibility)

When it comes to navigation, both distance and accessibility are crucial factors. Planning your route involves determining whether your desired location is reachable and the best approach for getting there.

To obtain the distance between the player and a WorldPoint or between two different points in a game, you can use methods that are likely part of a pathfinding or utility class in the game's code structure. Here's how you can do it:

    // Calculate the tile distance from the player to the desired WorldPoint.
    int distanceToTarget = pathing.distanceTo(new WorldPoint(3000, 2000, 0));
    
    // Calculate the tile distance between two WorldPoints.
    int distanceBetweenPoints = pathing.distanceTo(new WorldPoint(3000, 2000, 0), new WorldPoint(3000, 2010, 0));
    

It is a good practice to verify whether your desired location is accessible before initiating any movement. This helps to ensure that you are taking a valid path and can save time and resources in navigation. Here's how you might check for reachability:

    // Verifies if the destination WorldPoint is accessible from the player's current location.
    boolean isReachable = pathing.reachable(new WorldPoint(3000, 2000, 0));
    
    // Determines if a direct path is available between two specific WorldPoints.
    boolean isReachable = pathing.reachable(new WorldPoint(3000, 2000, 0), new WorldPoint(3000, 2010, 0));
    

### [Navigating](#navigating)

When it comes to navigating in a game, there are different methods to achieve this. What you need is one or more WorldPoint objects.

To walk to a desired WorldPoint within view distance, you can use the following code:

    // Navigate to one tile within view distance
    WorldPoint target = new WorldPoint(3000, 2000, 0);
    pathing.step(target);
    

When you need to navigate over larger distances, beyond the view range, you must split up the journey:

    // Create multiple WorldPoints between the player's location and the end destination.
    WorldPoint destination = new WorldPoint(3000, 2000, 0);
    WorldPoint[] path = pathing.createLocalPath(destination);
    pathing.walkPath(path); // Walks along the generated path to the next WorldPoint.
    

Last Updated: 4/27/2024, 10:39:32 PM

Contributors: the-reminisce

[

Prev

Working with Widgets

](/docs-api/guide/widgets.html)[

Next

Implementing Sleep Conditions and Delays

](/docs-api/guide/sleeps-delays.html)