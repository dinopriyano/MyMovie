package com.dicoding.mymovie.utils

import com.dicoding.mymovie.R
import com.dicoding.mymovie.data.MovieEntity
import com.dicoding.mymovie.data.TvEntity
import java.util.*
import kotlin.collections.ArrayList

object DataDummy {
    fun generateDummyMovie(): ArrayList<MovieEntity>{
        var movies = ArrayList<MovieEntity>()
        movies.add(
            MovieEntity(
                "mv1",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "Greg Russo",
                110,
                7.8,
                Date(2021,4,14)
            )
        )

        movies.add(
            MovieEntity(
                "mv2",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg",
                "Godzilla vs. Kong",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                "Adam Wingard",
                113,
                8.2,
                Date(2021,3,24)
            )
        )

        movies.add(
            MovieEntity(
                "mv3",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/AoWY1gkcNzabh229Icboa1Ff0BM.jpg",
                "Vanquish",
                "Victoria is a young mother trying to put her dark past as a Russian drug courier behind her, but retired cop Damon forces Victoria to do his bidding by holding her daughter hostage. Now, Victoria must use guns, guts and a motorcycle to take out a series of violent gangsters—or she may never see her child again.",
                "George Gallo",
                96,
                6.2,
                Date(2021,4,16)
            )
        )

        movies.add(
            MovieEntity(
                "mv4",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/h8Rb9gBr48ODIwYUttZNYeMWeUU.jpg",
                "Demon Slayer -Kimetsu no Yaiba- The Movie: Mugen Train",
                "Tanjirō Kamado, joined with Inosuke Hashibira, a boy raised by boars who wears a boar's head, and Zenitsu Agatsuma, a scared boy who reveals his true power when he sleeps, boards the Infinity Train on a new mission with the Fire Hashira, Kyōjurō Rengoku, to defeat a demon who has been tormenting the people and killing the demon slayers who oppose it!",
                "Haruo Sotozaki",
                117,
                8.3,
                Date(2021,6,1)
            )
        )

        movies.add(
            MovieEntity(
                "mv5",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/oBgWY00bEFeZ9N25wWVyuQddbAo.jpg",
                "Nobody",
                "Hutch Mansell, a suburban dad, overlooked husband, nothing neighbor — a \"nobody.\" When two thieves break into his home one night, Hutch's unknown long-simmering rage is ignited and propels him on a brutal path that will uncover dark secrets he fought to leave behind.",
                "Ilya Naishuller",
                92,
                8.5,
                Date(2021,3,26)
            )
        )

        movies.add(
            MovieEntity(
                "mv6",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/duK11VQd4UPDa7UJrgrGx90xJOx.jpg",
                "Thunder Force",
                "In a world where supervillains are commonplace, two estranged childhood best friends reunite after one devises a treatment that gives them powers to protect their city.",
                "Ben Falcone",
                107,
                5.8,
                Date(2021,4,9)
            )
        )

        movies.add(
            MovieEntity(
                "mv7",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lPsD10PP4rgUGiGR4CCXA6iY0QQ.jpg",
                "Raya and the Last Dragon",
                "Long ago, in the fantasy world of Kumandra, humans and dragons lived together in harmony. But when an evil force threatened the land, the dragons sacrificed themselves to save humanity. Now, 500 years later, that same evil has returned and it’s up to a lone warrior, Raya, to track down the legendary last dragon to restore the fractured land and its divided people.",
                "Carlos López Estrada",
                107,
                7.8,
                Date(2021,4,14)
            )
        )

        movies.add(
            MovieEntity(
                "mv8",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/tnAuB8q5vv7Ax9UAEje5Xi4BXik.jpg",
                "Zack Snyder's Justice League",
                "Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions.",
                "Zack Snyder",
                242,
                8.5,
                Date(2021,3,18)
            )
        )

        movies.add(
            MovieEntity(
                "mv9",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/6vcDalR50RWa309vBH1NLmG2rjQ.jpg",
                "The Marksman",
                "im Hanson’s quiet life is suddenly disturbed by two people crossing the US/Mexico border – a woman and her young son – desperate to flee a Mexican cartel. After a shootout leaves the mother dead, Jim becomes the boy’s reluctant defender. He embraces his role as Miguel’s protector and will stop at nothing to get him to safety, as they go on the run from the relentless assassins.",
                "Robert Lorenz",
                108,
                7.5,
                Date(2021,1,15)
            )
        )

        movies.add(
            MovieEntity(
                "mv10",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/msI5a9TPnepx47JUb2vl88hb80R.jpg",
                "Miraculous World: Shanghai – The Legend of Ladydragon",
                "To join Adrien in Shanghai, Marinette is going to visit her uncle Wang who is celebrating his anniversary. But, as soon as she arrives in China, her purse gets stolen with Tikki inside, whom she needs to secretly transform into Ladybug! Without money and alone in the immense city, Marinette accepts the help of a young and resourceful girl, Fei. The two girls will ally and discover the existence of a new magical jewel, the Prodigious. Hawk Moth, also present in Shanghai, seeks to finding it since a long time...",
                "Thomas Astruc",
                54,
                7.9,
                Date(2021,4,4)
            )
        )

        return movies
    }

    fun generateDummyTv(): ArrayList<TvEntity>{
        var tves = ArrayList<TvEntity>()
        tves.add(
            TvEntity(
                "tv1",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                "Malcolm Spellman",
                50,
                7.9,
                Date(2021,3,19)
            )
        )

        tves.add(
            TvEntity(
                "tv2",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/yDWJYRAwMNKbIYT8ZB33qy84uzO.jpg",
                "Invincible",
                "Mark Grayson is a normal teenager except for the fact that his father is the most powerful superhero on the planet. Shortly after his seventeenth birthday, Mark begins to develop powers of his own and enters into his father’s tutelage.",
                "Robert Kirkman",
                45,
                8.9,
                Date(2021,3,26)
            )
        )

        tves.add(
            TvEntity(
                "tv3",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                "The Good Doctor",
                "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives",
                "David Shore",
                43,
                8.6,
                Date(2017,9,25)
            )
        )

        tves.add(
            TvEntity(
                "tv4",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/Q1ZYG3kDS8iVIHOYOJ9NQmV0q7.jpg",
                "Haunted: Latin America",
                "Real people's terrifying tales of the chilling, unexplained and paranormal come to life with dramatic reenactments in this reality series.",
                "Netflix Latinoamérica",
                30,
                7.4,
                Date(2021,3,31)
            )
        )

        tves.add(
            TvEntity(
                "tv5",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg",
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "Greg Berlanti, Geoff Johns, Andrew Kreisberg",
                44,
                7.7,
                Date(2014,10,7)
            )
        )

        tves.add(
            TvEntity(
                "tv6",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                "Lucifer",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                "Tom Kapinos",
                45,
                8.5,
                Date(2016,1,25)
            )
        )

        tves.add(
            TvEntity(
                "tv7",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/34FaY8qpjBAVysSfrJ1l7nrAQaD.jpg",
                "Luis Miguel: The Series",
                "The series dramatizes the life story of Mexican superstar singer Luis Miguel, who has captivated audiences in Latin America and beyond for decades.",
                "Pablo Cruz",
                45,
                8.0,
                Date(2018,4,22)
            )
        )

        tves.add(
            TvEntity(
                "tv8",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg",
                "Game of Thrones",
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                "David Benioff, D. B. Weiss",
                60,
                8.4,
                Date(2011,4,17)
            )
        )

        tves.add(
            TvEntity(
                "tv9",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/o7uk5ChRt3quPIv8PcvPfzyXdMw.jpg",
                "Who Killed Sara?",
                "iHell-bent on exacting revenge and proving he was framed for his sister's murder, Álex sets out to unearth much more than the crime's real culprit.",
                "José Ignacio Valenzuela",
                40,
                7.8,
                Date(2021,3,24)
            )
        )

        tves.add(
            TvEntity(
                "tv10",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/vlv1gn98GqMnKHLSh0dNciqGfBl.jpg",
                "Superman & Lois",
                "After years of facing megalomaniacal supervillains, monsters wreaking havoc on Metropolis, and alien invaders intent on wiping out the human race, The Man of Steel aka Clark Kent and Lois Lane come face to face with one of their greatest challenges ever: dealing with all the stress, pressures and complexities that come with being working parents in today's society.",
                "Greg Berlanti, Odd Helbing",
                64,
                8.3,
                Date(2021,2,23)
            )
        )

        return tves
    }

    fun getAvatar(idx: Int): Int{
        val avatars = arrayListOf<Int>(R.drawable.person_one,R.drawable.person_two,R.drawable.person_three)
        return avatars.get(idx)
    }
}