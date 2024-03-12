package com.dicoding.fruits.`object`

import com.dicoding.fruits.R
import com.dicoding.fruits.fruits.Fruits

object FruitsData {
    private val fruitsNames = arrayOf(
        "GRAPE",
        "APPLE",
        "DURIAN",
        "ORANGE",
        "MANGO",
        "MANGOSTEEN",
        "PAPAYA",
        "BANANA",
        "WATERMELON",
        "SOURSOP")

    private val fruitsSpecies = arrayOf(
        "Vitis vinifera L.",
        "Malus domestica",
        "Durio zibethinus Murr",
        "Citrus sinensis",
        "Mangifera indica",
        "Garcinia mangostana",
        "Carica papaya L.",
        "Musa paradisiaca L.",
        "Citrullus lanatus",
        "Annona muricata L."
    )

    private val fruitsDetails = arrayOf(
        "Spermatophyta \n"+
                "Magnoliopsida \n"+
                "Vitales \n"+
                "Vitaceae \n"+
                "Vitis L. \n",
        "Magnoliophyta \n"+
                "Magnoliopsida \n"+
                "Rosales \n"+
                "Rosaceae \n"+
                "Malus \n",
        "Magnoliophyta \n"+
                "Magnoliopsida \n"+
                "Malvales \n"+
                "Bombaceae \n"+
                "Durio \n",
        "Spermatophyta \n"+
                "Dicotyledonae \n"+
                "Rutales \n"+
                "Rutaceae \n"+
                "Citrus \n",
        "Magnoliophyta \n"+
                "Magnoliopsida \n"+
                "Sapindales \n"+
                "Anacardiaceae \n"+
                "Mangifera \n",
        "Magnoliophyta \n"+
                "Magnoliopsida \n"+
                "Malpighiales \n"+
                "Clusiaceae \n"+
                "Garcinia \n",
        "Tracheophyta \n"+
                "Magnoliopsida \n"+
                "Brassicales \n"+
                "Caricaceae \n"+
                "Carica L. \n",
        "Tracheophyta \n"+
                "Monocotyledonae \n"+
                "Zingiberales \n"+
                "Musaceae \n"+
                "Musa \n",
        "Magnoliophyta \n"+
                "Magnoliopsida \n"+
                "Cucurbitales \n"+
                "Cucurbitaceae \n"+
                "Citrullus \n",
        "Magnoliophyta \n"+
                "Magnoliopsida \n"+
                "Magnoliales \n"+
                "Annonaceae \n"+
                "Annona \n"
         )

    private val fruitsOverviews = arrayOf(
        "Grapes belong to the group of dicotyledons or seeds in two pieces. The roots of grapevines have rapid development if the soil is loose, and when the rainy season arrives, grape roots can appear on the roots of the twigs. This makes the vine easier to propagate by cuttings or grafts compared to generative way.",
        "Apple is a type of fruit, or fruit produced from the apple tree. Apples are usually red in color when ripe and ready to eat, but the skin can also be green or yellow. The skin of the fruit is a bit soft and the flesh is hard. This fruit has some seeds in it.",
        "Durian is the name of a tropical plant originating from Southeast Asia, as well as the name of its edible fruit. This name is taken from the characteristic hard fruit skin and sharp curves that resemble thorns. The popular name is the king of all fruits or King of Fruit. Durian is a controversial fruit, although many people like it, but some are sick of the smell.",
        "Oranges or limes are all flowering plants belonging to the citrus genus of the Rutaceae tribe. Its members are tree-shaped with fleshy fruit with a fresh sour taste, although many of the members have a sweet taste. The sour taste comes from the citric acid content that is indeed contained in all the members.",
        "Mango or mempelam is the name of a type of fruit, as well as the name of the tree. The name mango comes from the Tamil mankay, which means man mango tree and kay fruit. This word was brought to Europe by the Portuguese and was absorbed into manga from Portuguese, mango from Spanish and English and others.",
        "Mangosteen is a kind of tree evergreen of tropical regions are believed to have originated from the Malay Peninsula and spread to the archipelago. Growing up to 7 to 25 meters. The fruit also called mangosteen, is purplish-red when mature, although there are also variants whose skin is red . The mangosteen fruit in the trade is known as the queen of fruit as a pair of durian the king of fruits. Mangosteen fruit has the highest antioxidant levels in the world.",
        "Papaya or betik is a plant that is thought to have originated from southern and northern Mexico. Papaya has now spread widely and is widely planted throughout the tropics for its fruit. The name papaya in Indonesian is taken from the Dutch papaja, which in turn also takes from the Arawak language name, papaya. In Javanese papaya is called kates and in Sundanese is called gedang.",
        "Banana is the general name given to a giant herbaceous plant with large leaves extending from the family Musaceae. The fruit is arranged in bunches with arranged groups of fingers called combs. Almost all bananas have a yellow skin when ripe, although some are colored orange, red, green, purple, or even almost black. Bananas as food are a source of energy (carbohydrates) and minerals, especially potassium.",
        "Watermelon is a vine that originates in the semi-desert areas of southern Africa. It is related to pumpkins, melons and cucumbers. Watermelons are usually harvested to be eaten fresh or juiced. Dried and roasted watermelon seeds can also be eaten inside. as a kuaci. The habitat of this plant is vines but cannot form adventitious roots. The range of propagation can reach tens of meters.",
        "Soursop is one of the popular fruits in Indonesia. Soursop trees themselves can grow anywhere, either with a lot of water or with little water. However, soursop still needs human assistance during the pollination process in order to get maximum results."

    )
    private val fruitsImages = intArrayOf(
        R.drawable.anggur,
        R.drawable.apel,
        R.drawable.durian,
        R.drawable.jeruk,
        R.drawable.mangga,
        R.drawable.manggis,
        R.drawable.pepaya,
        R.drawable.pisang,
        R.drawable.semangka,
        R.drawable.sirsak
    )

    val listData: ArrayList<Fruits>
        get() {
            val list = arrayListOf<Fruits>()
            for (position in fruitsNames.indices){
                val fruits = Fruits()
                fruits.name = fruitsNames[position]
                fruits.species = fruitsSpecies[position]
                fruits.detail = fruitsDetails[position]
                fruits.overview = fruitsOverviews[position]
                fruits.image = fruitsImages[position]
                list.add(fruits)
            }
            return list
        }
}