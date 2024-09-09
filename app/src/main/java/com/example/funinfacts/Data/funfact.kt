package com.example.funinfacts.Data

import androidx.annotation.DrawableRes
import com.example.funinfacts.R

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
        "A day on Venus is longer than a year on Venus.",
        "Neutron stars are so dense that a sugar-cube-sized amount of their material would weigh as much as a mountain.",
        "Saturn’s rings are made of ice and rock particles.",
        "The largest volcano in the solar system is on Mars, called Olympus Mons.",
        "The footprints on the Moon will remain there for millions of years because the Moon has no atmosphere.",
        "There is a giant cloud of alcohol in the constellation Aquila that could fill 400 trillion pints of beer.",
        "Space is completely silent because there is no atmosphere for sound to travel through.",
        "A full NASA space suit costs around $12 million."
    )
)

val technologyCategory = FunFactCategory(
    imageId = R.drawable.technology, // Replace with actual drawable resource ID
    name = "Technology",
    funFacts = listOf(
        "The first computer virus was created in 1983.",
        "The first email was sent by Ray Tomlinson to himself in 1971.",
        "The world’s first 1GB hard drive, introduced in 1980, weighed over 500 pounds.",
        "The first mouse was made of wood.",
        "The original Xbox had a bug that would make it catch fire.",
        "Over 90% of the world’s currency exists only on computers.",
        "The first camera required 8 hours to take a photo.",
        "The first alarm clock could only ring at 4 AM.",
        "The first website ever created is still online.",
        "Bluetooth technology is named after a 10th-century Scandinavian king, Harald Bluetooth."
    )
)

val sportsCategory = FunFactCategory(
    imageId = R.drawable.sports, // Replace with actual drawable resource ID
    name = "Sports",
    funFacts = listOf(
        "Basketball was invented by Dr. James Naismith in 1891.",
        "The Olympic Games were originally a religious festival in honor of Zeus.",
        "Soccer is the most popular sport in the world, with over 4 billion fans.",
        "Golf is the only sport to have been played on the Moon.",
        "The first Olympics did not include a marathon.",
        "Michael Phelps has won more Olympic gold medals than 161 countries.",
        "The longest tennis match in history lasted 11 hours and 5 minutes.",
        "The fastest recorded tennis serve is over 160 mph.",
        "Baseball is the only sport that has been played on every continent, including Antarctica.",
        "The first World Cup was played in 1930 in Uruguay."
    )
)

val scienceCategory = FunFactCategory(
    imageId = R.drawable.science, // Replace with actual drawable resource ID
    name = "Science",
    funFacts = listOf(
        "Water is the only substance that exists in all three states of matter: solid, liquid, and gas.",
        "The human body contains enough carbon to fill 9,000 pencils.",
        "Light from the Sun takes approximately 8 minutes and 20 seconds to reach Earth.",
        "Bananas are berries, but strawberries are not.",
        "Sharks predate trees; they have existed for over 400 million years.",
        "Hot water freezes faster than cold water, known as the Mpemba effect.",
        "DNA was first discovered in 1869, but its double-helix structure was not described until 1953.",
        "There are more atoms in a glass of water than glasses of water in all the oceans on Earth.",
        "There are more molecules in a single cup of water than there are cups of water in the entire ocean.",
        "A single teaspoon of honey represents the life work of 12 bees."
    )
)

val musicCategory = FunFactCategory(
    imageId = R.drawable.music, // Replace with actual drawable resource ID
    name = "Music",
    funFacts = listOf(
        "The world’s oldest known musical instrument is a 40,000-year-old flute made from bird bone.",
        "Beethoven continued to compose music even after he went completely deaf.",
        "The shortest war in history lasted only 38 minutes. It was fought between the British Empire and the Sultanate of Zanzibar.",
        "The most expensive musical instrument ever sold is a Stradivarius violin.",
        "Mozart composed his first symphony when he was just eight years old.",
        "The longest recorded piece of music is over 18 hours long.",
        "A piano has 88 keys but more than 230 strings inside.",
        "The first CD pressed in the United States was Bruce Springsteen's 'Born in the U.S.A.'",
        "Guitar strings were originally made from animal intestines.",
        "Jimi Hendrix could not read or write music, yet he became one of the most influential musicians in history."
    )
)

val historyCategory = FunFactCategory(
    imageId = R.drawable.history, // Replace with actual drawable resource ID
    name = "History",
    funFacts = listOf(
        "The Great Wall of China is not visible from space with the naked eye.",
        "Cleopatra lived closer in time to the moon landing than to the construction of the Great Pyramid of Giza.",
        "The shortest war in history lasted only 38 minutes.",
        "The Eiffel Tower was originally intended to be dismantled after 20 years.",
        "Alexander the Great was buried in a vat of honey to preserve his body.",
        "Napoleon was once attacked by thousands of rabbits.",
        "The longest reigning monarch in history was King Louis XIV of France.",
        "The Titanic was about three times the size of Noah's Ark.",
        "The Leaning Tower of Pisa was never intended to lean.",
        "Queen Elizabeth II is distantly related to Vlad the Impaler (Dracula)."
    )
)

val geographyCategory = FunFactCategory(
    imageId = R.drawable.geography, // Replace with actual drawable resource ID
    name = "Geography",
    funFacts = listOf(
        "There are more than 7,000 islands in the Philippines.",
        "Russia has a larger surface area than Pluto.",
        "Canada has the longest coastline of any country in the world.",
        "Iceland does not have mosquitoes.",
        "Africa is the only continent that is in all four hemispheres.",
        "Alaska is the most northern, eastern, and western state in the United States.",
        "Australia is wider than the moon.",
        "Mount Everest grows about 4 millimeters higher every year due to shifting tectonic plates.",
        "Antarctica is the driest, windiest, and coldest continent on Earth.",
        "The Amazon rainforest produces 20% of the world’s oxygen supply."
    )
)

val foodCategory = FunFactCategory(
    imageId = R.drawable.food, // Replace with actual drawable resource ID
    name = "Food",
    funFacts = listOf(
        "Honey never spoils. Archaeologists have found pots of honey in ancient Egyptian tombs that are over 3,000 years old and still edible.",
        "The world's most expensive pizza costs $12,000 and takes 72 hours to make.",
        "French fries were first invented in Belgium, not France.",
        "The most stolen food in the world is cheese.",
        "Bananas are berries, but strawberries aren't.",
        "Apples float on water because they are 25% air.",
        "Potatoes were the first vegetable to be grown in space.",
        "Peanuts are not nuts; they are legumes.",
        "Cucumbers are 96% water.",
        "Carrots were originally purple."
    )
)

val artCategory = FunFactCategory(
    imageId = R.drawable.art, // Replace with actual drawable resource ID
    name = "Art",
    funFacts = listOf(
        "The Mona Lisa has no eyebrows. It was the fashion in Renaissance Florence to shave them off.",
        "Vincent van Gogh only sold one painting during his lifetime.",
        "The famous painting ‘The Scream’ by Edvard Munch has been stolen multiple times.",
        "Leonardo da Vinci was ambidextrous.",
        "Michelangelo hated painting the Sistine Chapel and considered himself a sculptor, not a painter.",
        "The Starry Night was painted in an asylum.",
        "Salvador Dalí designed the Chupa Chups logo.",
        "Picasso could draw before he could walk.",
        "The largest art heist in history took place at the Isabella Stewart Gardner Museum in Boston in 1990.",
        "Banksy once shredded one of his paintings just after it was auctioned for over a million dollars."
    )
)

val literatureCategory = FunFactCategory(
    imageId = R.drawable.literature, // Replace with actual drawable resource ID
    name = "Literature",
    funFacts = listOf(
        "William Shakespeare invented over 1,700 words.",
        "The longest novel ever written is 'In Search of Lost Time' by Marcel Proust.",
        "Dr. Seuss wrote 'Green Eggs and Ham' on a bet that he couldn’t write a book with only 50 different words.",
        "J.K. Rowling was rejected by 12 publishers before Harry Potter was accepted.",
        "The first novel ever written was 'The Tale of Genji' by Murasaki Shikibu.",
        "The shortest poem ever written is a couplet by Strickland Gillilan titled 'Lines on the Antiquity of Microbes'.",
        "The Bible is the most shoplifted book in the world.",
        "Agatha Christie is the best-selling novelist of all time.",
        "The book 'Goosebumps' has sold over 400 million copies worldwide.",
        "George Orwell's 'Animal Farm' was rejected by multiple publishers because it was too controversial."
    )
)

val psychologyCategory = FunFactCategory(
    imageId = R.drawable.psychology, // Replace with actual drawable resource ID
    name = "Psychology",
    funFacts = listOf(
        "The average person spends about 6 years of their life dreaming.",
        "Yawning is contagious, even thinking about yawning can make you yawn.",
        "The human brain has about 86 billion neurons.",
        "Laughing burns calories and boosts your immune system.",
        "Your brain can process images as fast as 13 milliseconds.",
        "You can't tickle yourself because your brain anticipates the sensation.",
        "The placebo effect works even when you know you're taking a placebo.",
        "Humans are naturally wired to notice negative events more than positive ones.",
        "Your favorite song is likely associated with an emotional event in your life.",
        "The fear of being without your phone is called nomophobia."
    )
)

val mythologyCategory = FunFactCategory(
    imageId = R.drawable.mythology, // Replace with actual drawable resource ID
    name = "Mythology",
    funFacts = listOf(
        "In Greek mythology, Athena was born fully grown and armored from Zeus's forehead.",
        "The Norse god Thor's hammer, Mjölnir, was so heavy that only he could lift it.",
        "In Hindu mythology, Ganesha has the head of an elephant.",
        "According to Egyptian mythology, the Sphinx's nose was broken off.",
        "The Minotaur was kept in a labyrinth built by Daedalus.",
        "Prometheus stole fire from the gods and gave it to humans.",
        "Medusa was once a beautiful maiden who was transformed into a monster.",
        "In Norse mythology, Ragnarok is the end of the world.",
        "The Greek god of wine, Dionysus, was also the god of theater.",
        "Zeus, the king of the Greek gods, overthrew his father, Cronus, to gain power."
    )
)

val transportationCategory = FunFactCategory(
    imageId = R.drawable.transportation, // Replace with actual drawable resource ID
    name = "Transportation",
    funFacts = listOf(
        "The first automobiles didn't have a steering wheel; drivers steered with a lever.",
        "The longest traffic jam in history was 62 miles long and lasted 12 days in China.",
        "The fastest train in the world can reach speeds of over 370 mph.",
        "The first bicycle was called a ‘velocipede’.",
        "The world’s first speeding ticket was issued in 1902.",
        "Airplanes reach a cruising altitude of around 35,000 feet.",
        "The first successful helicopter flight took place in 1939.",
        "The largest cargo ship in the world is the size of four football fields.",
        "The Wright brothers made their first successful flight on December 17, 1903.",
        "The highest parachute jump ever was from the edge of space, over 128,000 feet."
    )
)

val fashionCategory = FunFactCategory(
    imageId = R.drawable.fashion, // Replace with actual drawable resource ID
    name = "Fashion",
    funFacts = listOf(
        "Heels were originally designed for men, not women.",
        "The first pair of jeans was made by Levi Strauss in 1873.",
        "The world’s most expensive shoes are worth over $15 million.",
        "The modern bra was invented in 1914 by Mary Phelps Jacob.",
        "Chanel No. 5 was the first perfume launched by Coco Chanel in 1921.",
        "The world’s largest collection of sneakers is over 2,500 pairs.",
        "The first fashion magazine was published in Germany in 1586.",
        "Neckties originated from Croatian mercenaries in the 17th century.",
        "The wedding dress tradition of wearing white began with Queen Victoria in 1840.",
        "Men’s shirt buttons are on the right while women’s are on the left due to historical dress codes."
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
        artCategory.name to artCategory,
        literatureCategory.name to literatureCategory,
        psychologyCategory.name to psychologyCategory,
        mythologyCategory.name to mythologyCategory,
        transportationCategory.name to transportationCategory,
        fashionCategory.name to fashionCategory
    )
)
