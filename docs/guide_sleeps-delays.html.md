   :root { --c-bg: #fff; } html.dark { --c-bg: #22272e; } html, body { background-color: var(--c-bg); } const userMode = localStorage.getItem('vuepress-color-scheme') const systemDarkMode = window.matchMedia && window.matchMedia('(prefers-color-scheme: dark)').matches if (userMode === 'dark' || (userMode !== 'light' && systemDarkMode)) { document.documentElement.classList.toggle('dark', true) } Implementing Sleep Conditions and Delays | SimpleBot Docs    .medium-zoom-overlay{position:fixed;top:0;right:0;bottom:0;left:0;opacity:0;transition:opacity .3s;will-change:opacity}.medium-zoom--opened .medium-zoom-overlay{cursor:pointer;cursor:zoom-out;opacity:1}.medium-zoom-image{cursor:pointer;cursor:zoom-in;transition:transform .3s cubic-bezier(.2,0,.2,1)!important}.medium-zoom-image--hidden{visibility:hidden}.medium-zoom-image--opened{position:relative;cursor:pointer;cursor:zoom-out;will-change:transform}

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
    *   [Implementing Sleep Conditions and Delays](/docs-api/guide/sleeps-delays.html)
        *   [Table of Contents](#table-of-contents)
        *   [Using Sleep Conditions](#using-sleep-conditions)
        *   [Using Sleeps](#using-sleeps)
        *   [Best Practices](#best-practices)
    *   [Best Practices](/docs-api/guide/best-practices.html)
    *   [Examples](/docs-api/guide/examples.html)

[Implementing Sleep Conditions and Delays](#implementing-sleep-conditions-and-delays)
=====================================================================================

Using sleep conditions and delays in your scripts is essential to ensure that your bot behaves more like a human player. Sleeps and delays help to simulate the time taken to perform an action, such as waiting for an animation to complete or waiting for an item to be used. Sleep conditions and delays are also useful for avoiding spamming the game server with too many actions in a short period.

This guide explains how to use sleeps and delays in your scripts to improve the efficiency and realism of your bot.

[Table of Contents](#table-of-contents)
---------------------------------------

*   [Using Sleep Conditions](#using-sleep-conditions)
*   [Using Sleeps](#using-sleeps)
*   [Best Practices](#best-practices)

[Using Sleep Conditions](#using-sleep-conditions)
-------------------------------------------------

The SimpleBot API provides the `onCondition()` method to sleep the current thread until a specified condition is met. This method checks the condition every 500 milliseconds and sleeps for a maximum of 5 seconds. If the condition is met before the timeout, the method returns `true`; otherwise, it returns `false`.

The `onCondition()` method has three overloaded versions:

1.  `onCondition(BooleanSupplier condition)` - This method sleeps for a maximum of 5 seconds, checking the condition every 500 milliseconds.
    
2.  `onCondition(BooleanSupplier condition, int timeout)` - This method sleeps for a maximum of `timeout` milliseconds, checking the condition every 500 milliseconds.
    
3.  `onCondition(BooleanSupplier condition, int timeout, int amount)` - This method sleeps for the specified `timeout * amount` milliseconds or until the condition is met.
    

The `BooleanSupplier` interface is a functional interface that takes no arguments and returns a boolean value. You can use lambda expressions to define the condition to be checked.

Here's an example of how to use the `onCondition()` method to wait for our player to start animating after attempting to attack an NPC. This will prevent the bot from trying to attack another NPC before we have finished attacking the current one:

    final SimpleNpc goblin = ctx.npcs.populate().filter("Goblin").nextNearest();
    if (goblin != null) {
        goblin.click("Attack");
        ctx.onCondition(() -> ctx.players.getLocal().isAnimating());// Wait for the player to start animating
        System.out.println("Our sleep condition has ended.");
    } else {
        System.out.println("NPC Goblin not found.");
    }
    

[Using Sleeps](#using-sleeps)
-----------------------------

The SimpleBot API provides the `sleep()` method to pause the current thread for a specified amount of time. This method is useful for adding delays between actions to simulate human-like behavior or to wait for a specific event to occur.

The `sleep()` method has two overloaded versions:

1.  `sleep(int ms)` - This method sleeps for `ms` milliseconds.
    
2.  `sleep(int min, int max)` - This method sleeps for a random amount of time between `min` and `max` milliseconds.
    

Here's an example of how to use the `sleep()` method to add a delay of 2 seconds after attempting to attack an NPC:

    final SimpleNpc goblin = ctx.npcs.populate().filter("Goblin").nextNearest();
    if (goblin != null) {
        goblin.click("Attack");
        ctx.sleep(2000); // Wait for 2 seconds before attacking the next NPC
        System.out.println("Our sleep has ended after 2 seconds.");
    } else {
        System.out.println("NPC Goblin not found.");
    }
    

[Best Practices](#best-practices)
---------------------------------

When using sleep conditions and delays in your scripts, consider the following best practices:

1.  Use sleep conditions to wait for specific conditions to be met before proceeding with the next action. This helps to synchronize the bot's actions with the game state.
    
2.  Use sleeps to add delays between actions to simulate human-like behavior and avoid spamming the game server with too many actions in a short period.
    
3.  Use random sleeps to add variability to your bot's behavior and make it less predictable to other players or anti-botting systems.
    
4.  Avoid using long sleep times, as this can make your bot appear slow and unresponsive. Instead, use sleep conditions to wait for specific events to occur before proceeding with the next action.
    
5.  Use sleep conditions and delays judiciously to balance efficiency and realism in your bot's behavior.
    

Last Updated: 4/27/2024, 11:13:39 PM

Contributors: the-reminisce

[

Prev

Walking and Movement

](/docs-api/guide/movement.html)[

Next

Best Practices

](/docs-api/guide/best-practices.html)