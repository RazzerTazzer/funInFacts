package com.example.funinfacts.Data

import androidx.annotation.DrawableRes
import com.example.funinfacts.R
import java.util.Locale.Category

data class FunFactCategory (
    @DrawableRes val imageId: Int,
    val name: String,
    val funFacts: List<String>
)

data class FunFactsMap (
    val categories: Map<String, FunFactCategory>
)

val animalCategory = FunFactCategory(
    imageId = R.drawable.animal, // Replace with actual drawable resource ID
    name = "Animals",
    funFacts = listOf(
        "Elephants are the only animals that can't jump.",
        "Octopuses have three hearts and blue blood.",
        "Giraffes have the same number of neck vertebrae as humans (seven).",
        "Honeybees can recognize human faces.",
        "Dolphins have names for each other and can call out to one another.",
        "Koalas have fingerprints that are almost indistinguishable from humans.",
        "Crows are incredibly intelligent and can use tools.",
        "Pandas spend around 10-16 hours a day eating bamboo.",
        "Starfish have no brain and can regenerate lost arms.",
        "Narwhals have a tooth that can grow up to 10 feet long.",
        "Sloths can hold their breath for up to 40 minutes underwater.",
        "Kangaroos can't walk backward.",
        "Butterflies taste with their feet.",
        "Penguins propose to their mates with a pebble.",
        "Hummingbirds are the only birds that can fly backwards.",
        "Rats laugh when tickled.",
        "Sea otters hold hands while sleeping to keep from drifting apart.",
        "Chameleons can move their eyes independently of each other.",
        "Wombats produce cube-shaped poop.",
        "Jellyfish have been around for over 500 million years, making them older than dinosaurs."
    )
)

val spaceCategory = FunFactCategory(
    imageId = R.drawable.space, // Replace with actual drawable resource ID
    name = "Space",
    funFacts = listOf(
        "The universe is expanding.",
        "There are more stars in the universe than grains of sand on all the beaches on Earth.",
        "A day on Venus is longer than a year on Venus."
    )
)

val technologyCategory = FunFactCategory(
    imageId = R.drawable.technology, // Replace with actual drawable resource ID
    name = "Technology",
    funFacts = listOf(
        "The first computer virus was created in 1983.",
        "The first email was sent by Ray Tomlinson to himself in 1971.",
        "The world’s first 1GB hard drive, introduced in 1980, weighed over 500 pounds."
    )
)

val sportsCategory = FunFactCategory(
    imageId = R.drawable.sports, // Replace with actual drawable resource ID
    name = "Sports",
    funFacts = listOf(
        "Basketball was invented by Dr. James Naismith in 1891.",
        "The Olympic Games were originally a religious festival in honor of Zeus.",
        "Soccer is the most popular sport in the world, with over 4 billion fans."
    )
)

val scienceCategory = FunFactCategory(
    imageId = R.drawable.science, // Replace with actual drawable resource ID
    name = "Science",
    funFacts = listOf(
        "Water is the only substance that exists in all three states of matter: solid, liquid, and gas.",
        "The human body contains enough carbon to fill 9,000 pencils.",
        "Light from the Sun takes approximately 8 minutes and 20 seconds to reach Earth."
    )
)

val musicCategory = FunFactCategory(
    imageId = R.drawable.music, // Replace with actual drawable resource ID
    name = "Music",
    funFacts = listOf(
        "The world’s oldest known musical instrument is a 40,000-year-old flute made from bird bone.",
        "Beethoven continued to compose music even after he went completely deaf.",
        "The shortest war in history lasted only 38 minutes. It was fought between the British Empire and the Sultanate of Zanzibar."
    )
)

val historyCategory = FunFactCategory(
    imageId = R.drawable.history, // Replace with actual drawable resource ID
    name = "History",
    funFacts = listOf(
        "The Great Wall of China is not visible from space with the naked eye.",
        "Cleopatra lived closer in time to the moon landing than to the construction of the Great Pyramid of Giza.",
        "The shortest war in history lasted only 38 minutes."
    )
)

val geographyCategory = FunFactCategory(
    imageId = R.drawable.geography, // Replace with actual drawable resource ID
    name = "Geography",
    funFacts = listOf(
        "There are more than 7,000 islands in the Philippines.",
        "Russia has a larger surface area than Pluto.",
        "Canada has the longest coastline of any country in the world."
    )
)

val foodCategory = FunFactCategory(
    imageId = R.drawable.food, // Replace with actual drawable resource ID
    name = "Food",
    funFacts = listOf(
        "Honey never spoils. Archaeologists have found pots of honey in ancient Egyptian tombs that are over 3,000 years old and still edible.",
        "The world's most expensive pizza costs $12,000 and takes 72 hours to make.",
        "French fries were first invented in Belgium, not France."
    )
)

val artCategory = FunFactCategory(
    imageId = R.drawable.art, // Replace with actual drawable resource ID
    name = "Art",
    funFacts = listOf(
        "The Mona Lisa has no eyebrows. It was the fashion in Renaissance Florence to shave them off.",
        "Vincent van Gogh only sold one painting during his lifetime.",
        "The famous painting ‘The Scream’ by Edvard Munch has been stolen multiple times."
    )
)

val funFacts = FunFactsMap(
    categories = mapOf(
        animalCategory.name to animalCategory,
        spaceCategory.name to spaceCategory,
        technologyCategory.name to technologyCategory,
        sportsCategory.name to sportsCategory,
        scienceCategory.name to scienceCategory,
        musicCategory.name to musicCategory,
        historyCategory.name to historyCategory,
        geographyCategory.name to geographyCategory,
        foodCategory.name to foodCategory,
        artCategory.name to artCategory
    )
)