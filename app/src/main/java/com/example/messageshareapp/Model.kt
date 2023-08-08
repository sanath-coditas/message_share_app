package com.example.messageshareapp


data class Hobby(var title: String)

object Supplier {
    val hobbies = listOf(
        Hobby("Running"), Hobby("Jogging"), Hobby("Golf"),
        Hobby("Swimming"), Hobby("Cycling"), Hobby("Reading"),
        Hobby("Painting"), Hobby("Cooking"), Hobby("Gardening"),
        Hobby("Photography"), Hobby("Traveling"), Hobby("Hiking"),
        Hobby("Yoga"), Hobby("Dancing"), Hobby("Music"),
        Hobby("Movies"), Hobby("Singing"), Hobby("Chess"),
        Hobby("Video Games"), Hobby("Collecting"),
        Hobby("Writing"), Hobby("Fishing"), Hobby("Skiing"),
        Hobby("Knitting"), Hobby("Woodworking"), Hobby("Sculpting"),
        Hobby("Sewing"), Hobby("Pottery"), Hobby("Embroidery"),
        Hobby("Bird Watching"), Hobby("Calligraphy"), Hobby("Camping")
    )
}