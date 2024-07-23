   :root { --c-bg: #fff; } html.dark { --c-bg: #22272e; } html, body { background-color: var(--c-bg); } const userMode = localStorage.getItem('vuepress-color-scheme') const systemDarkMode = window.matchMedia && window.matchMedia('(prefers-color-scheme: dark)').matches if (userMode === 'dark' || (userMode !== 'light' && systemDarkMode)) { document.documentElement.classList.toggle('dark', true) } Query API | SimpleBot Docs    .medium-zoom-overlay{position:fixed;top:0;right:0;bottom:0;left:0;opacity:0;transition:opacity .3s;will-change:opacity}.medium-zoom--opened .medium-zoom-overlay{cursor:pointer;cursor:zoom-out;opacity:1}.medium-zoom-image{cursor:pointer;cursor:zoom-in;transition:transform .3s cubic-bezier(.2,0,.2,1)!important}.medium-zoom-image--hidden{visibility:hidden}.medium-zoom-image--opened{position:relative;cursor:pointer;cursor:zoom-out;will-change:transform}

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
        *   [Overview](#overview)
        *   [Table of Contents](#table-of-contents)
        *   [Basic Query Operations](#basic-query-operations)
            *   [Populate the Query](#populate-the-query)
            *   [Checking Query Contents](#checking-query-contents)
            *   [Filtering the Query](#filtering-the-query)
            *   [Sorting the Query](#sorting-the-query)
        *   [Advanced Query Filtering](#advanced-query-filtering)
            *   [Filtering by Actions](#filtering-by-actions)
            *   [Location-Based Filtering](#location-based-filtering)
        *   [Query Omissions](#query-omissions)
            *   [Excluding NPCs](#excluding-npcs)
        *   [Iterating Over Query Results](#iterating-over-query-results)
        *   [Retrieving Query Results](#retrieving-query-results)
        *   [Stream Support](#stream-support)
        *   [Best Practices](#best-practices)
        *   [Conclusion](#conclusion)
    *   [Interacting with NPCs](/docs-api/guide/npcs.html)
    *   [Interacting with Objects](/docs-api/guide/objects.html)
    *   [Interacting with Items and Inventory](/docs-api/guide/items.html)
    *   [Working with Widgets](/docs-api/guide/widgets.html)
    *   [Walking and Movement](/docs-api/guide/movement.html)
    *   [Implementing Sleep Conditions and Delays](/docs-api/guide/sleeps-delays.html)
    *   [Best Practices](/docs-api/guide/best-practices.html)
    *   [Examples](/docs-api/guide/examples.html)

[Query API](#query-api)
=======================

The Query API is essential for SimpleBot script developers, providing a robust way to interact with game entities such as NPCs, items, and objects. This page will guide you through understanding and utilizing the Query API to efficiently select and manage game entities based on various conditions and criteria.

[Overview](#overview)
---------------------

Before using the Query API, it is essential to populate your query to fetch the latest data from the game. Failing to populate a query can lead to working with outdated or incorrect data, which may affect script performance and reliability.

[Table of Contents](#table-of-contents)
---------------------------------------

*   [Basic Query Operations](#basic-query-operations)
    *   [Populate the Query](#populate-the-query)
    *   [Checking Query Contents](#checking-query-contents)
    *   [Filtering the Query](#filtering-the-query)
    *   [Sorting the Query](#sorting-the-query)
*   [Advanced Query Filtering](#advanced-query-filtering)
    *   [Filtering by Actions](#filtering-by-actions)
    *   [Location-Based Filtering](#location-based-filtering)
*   [Query Omissions](#query-omissions)
    *   [Excluding NPCs](#excluding-npcs)
*   [Iterating Over Query Results](#iterating-over-query-results)
*   [Retrieving Query Results](#retrieving-query-results)
*   [Stream Support](#stream-support)
*   [Best Practices](#best-practices)
*   [Conclusion](#conclusion)

[Basic Query Operations](#basic-query-operations)
-------------------------------------------------

### [Populate the Query](#populate-the-query)

To start using a query, you must first populate it. This clears any previous data in the query and loads it with current items from the game environment.

    SimpleEntityQuery<SimpleNpc> npcs = ctx.npcs.populate();
    

### [Checking Query Contents](#checking-query-contents)

To check if your query contains any entities, you can use the `isEmpty()` method. This is useful for determining if the query has been successfully populated and contains the desired entities.

    boolean isPresent = !npcs.isEmpty();
    System.out.println("Is the NPC present? " + isPresent);
    

### [Filtering the Query](#filtering-the-query)

You can filter the query based on specific criteria such as name, ID, or actions. The `filter()` method allows you to specify the condition to match.

    // Filter NPCs by name
    npcs.filter("Bob");
    
    //Filter npcs by multiple names
    npcs.filter("Cow", "Chicken", "Goblin");
    
    //Filter npcs that contain the word "Cow" in their name
    npcs.filterContains("Cow");
    
    // Filter NPCs by ID
    npcs.filter(494);
    
    // Filter using a custom predicate
    npcs.filter(npc -> npc.getName().contains("Bob"));
    

### [Sorting the Query](#sorting-the-query)

You can sort the query results based on a specific attribute such as distance or health. The `sort()` method allows you to specify the sorting criteria. The `nearest()` method sorts the query results by distance from our local player.

    // Sort NPCs by distance
    npcs.nearest()
    
    // Sort NPCs by health
    npcs.sort(Comparator.comparingInt(SimpleNpc::getHealth));
    

[Advanced Query Filtering](#advanced-query-filtering)
-----------------------------------------------------

### [Filtering by Actions](#filtering-by-actions)

You can filter NPCs based on the actions they can perform. This is useful for selecting NPCs that can be attacked, traded with, or interacted with in other ways.

    // Filter NPCs by actions
    npcs.filterHasAction("Attack", "Trade", "Talk-to");
    

### [Location-Based Filtering](#location-based-filtering)

You can filter NPCs based on their location in the game world. This is useful for selecting NPCs within a specific area or near a particular coordinate.

    // Filter NPCs by location
    npcs.filterWithin(10); // Filter NPCs within 10 tiles of the local player
    
    // Filter NPCs by area
    WorldArea area = new WorldArea(new WorldPoint(3222, 3218, 0), new WorldPoint(3225, 3221, 0));
    npcs.filter(area); // Filter NPCs within the specified area
    
    // Filter NPCs by specific coordinates
    WorldPoint[] points = {new WorldPoint(3222, 3218, 0), new WorldPoint(3225, 3221, 0)};
    npcs.filter(points); // Filter NPCs at the specified coordinates
    
    // Filter NPCs by distance to a specific coordinate
    WorldPoint point = new WorldPoint(3222, 3218, 0);
    npcs.filterWithin(point, 5); // Filter NPCs within 5 tiles of the specified point
    

[Query Omissions](#query-omissions)
-----------------------------------

### [Excluding NPCs](#excluding-npcs)

You can exclude specific NPCs from the query results by using the `omit()` method. This is useful for filtering out unwanted entities from your selection.

    // Omit NPCs by name
    npcs.omit("Bob");
    
    // Omit multiple NPCs by name
    npcs.omit("Cow", "Chicken", "Goblin");
    
    // Omit NPCs that contain the word "Cow" in their name
    npcs.omitContains("Cow");
    
    // Omit NPCs by ID
    npcs.omit(494);
    
    // Omit NPCs by custom predicate
    npcs.omit(npc -> npc.getName().contains("Bob"));
    

[Iterating Over Query Results](#iterating-over-query-results)
-------------------------------------------------------------

Once you have populated and filtered your query, you can iterate over the results to perform actions on the selected entities.

    // Iterate over NPCs
    for (SimpleNpc npc : npcs) {
        System.out.println("NPC Name: " + npc.getName());
    }
    

[Retrieving Query Results](#retrieving-query-results)
-----------------------------------------------------

To retrieve the results of your query, you can use the `next()` method to get the next entity that matches your criteria. This method returns `null` if no matching entity is found.

    // Retrieve the next NPC in the query
    SimpleNpc npc = npcs.next();
    if (npc != null) {
        System.out.println("Found NPC: " + npc.getName());
    } else {
        System.out.println("No matching NPC found.");
    }
    
    // Retrieve the next NPC in the query without removing it
    SimpleNpc nextNpc = npcs.peekNext();
    if (nextNpc != null) {
        System.out.println("Next NPC: " + nextNpc.getName());
    } else {
        System.out.println("No next NPC found.");
    }
    
    // Retrieve the next nearest NPC in the query
    SimpleNpc nearestNpc = npcs.nextNearest();
    if (nearestNpc != null) {
        System.out.println("Nearest NPC: " + nearestNpc.getName());
    } else {
        System.out.println("No nearest NPC found.");
    }
    

[Stream Support](#stream-support)
---------------------------------

The Query API supports Java Streams, allowing you to perform advanced operations on the query results using functional programming techniques.

    // Get a list of NPCs with the name "Banker"
    List<SimpleNpc> bankers = npcs.toStream()
        .filter(npc -> npc.getName().equals("Banker"))
        .collect(Collectors.toList());
    

[Best Practices](#best-practices)
---------------------------------

*   Always populate your query before filtering or sorting to ensure you have the latest data.
*   Use filtering and sorting criteria to narrow down your query results effectively.
*   Always null-check the results of your query operations to handle cases where no matching entity is found.

[Conclusion](#conclusion)
-------------------------

The Query API provides a flexible and efficient way to interact with game entities in SimpleBot scripts. By mastering the basic and advanced query operations, you can create powerful scripts that automate gameplay tasks effectively and reliably. Experiment with different filtering and sorting criteria to optimize your queries and enhance your script's performance.

Last Updated: 4/27/2024, 10:39:32 PM

Contributors: the-reminisce

[

Prev

SimpleBot RuneLite API Documentation

](/docs-api/guide/)[

Next

Interacting with NPCs

](/docs-api/guide/npcs.html)