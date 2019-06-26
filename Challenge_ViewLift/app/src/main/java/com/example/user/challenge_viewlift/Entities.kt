package com.example.user.challenge_viewlift

import org.simpleframework.xml.*
import javax.xml.bind.annotation.XmlRootElement

@Root(strict = false)
@NamespaceList(
    Namespace(reference = "http://purl.org/rss/1.0/modules/content/", prefix = "content"),
    Namespace(reference = "http://search.yahoo.com/mrss/", prefix = "media")
)
class Rss(
    @get:Element(name = "channel")
    @set:Element(name = "channel")
    var channel: Channel? = null
)

@Root(name = "channel", strict = false)
class Channel {
    @get:Element(name = "title")
    @set:Element(name = "title")
    var title: String? = null

//    @set:Element(name = "link", required = false)
//    @get:Element (name = "link", required = false)
//    var link: String? = null

    @get:Element(name = "language")
    @set:Element(name = "language")
    var language: String? = null

    @get:Element(name = "pubDate")
    @set:Element(name = "pubDate")
    var pubDate: String? = null

    @get:Element(name = "lastBuildDate")
    @set:Element(name = "lastBuildDate")
    var lastBuildDate: String? = null

    @get:Element(name = "description", required = false)
    @set:Element(name = "description", required = false)
    var description: String? = null

    @get:Element(name = "image", required = false)
    @set:Element(name = "image", required = false)
    var image: Image? = null

    @get:ElementList(name = "item", inline = true)
    @set:ElementList(name = "item", inline = true)
    var items: List<Item>? = null
}

@Root(strict = false)
class Image {

//    @get:Element(name = "link", required = false)
//    @set:Element(name = "link", required = false)
//    var link: String? = null

    @get:Element(name = "title", required = false)
    @set:Element(name = "title", required = false)
    var title: String? = null

    @get:Element(name = "url", required = false)
    @set:Element(name = "url", required = false)
    var url: String? = null

    @get:Element(name = "description")
    @set:Element(name = "description")
    var description: String? = null

    @get:Element(name = "height")
    @set:Element(name = "height")
    var height: Int? = null


}

@XmlRootElement
class Item {

    @get:Element(name = "title")
    @set:Element(name = "title")
    var title: String? = null

    @get:Element(name = "pubDate")
    @set:Element(name = "pubDate")
    var pubDate: String? = null

//    @Element(name = "link", required = false)
//    var link: String? = null

    @get:Element(name = "description")
    @set:Element(name = "description")
    var description: String? = null

    @get:Element(name = "guid")
    @set:Element(name = "guid")
    var guid: String? = null

//    @get:ElementList var category: List<String>? = null
//    @set:ElementList(entry = "category", required = false, inline = true)

    @get:Element(name = "content")
    @set:Element(name = "content")
    @Namespace(reference = "http://search.yahoo.com/mrss/", prefix = "media")
    var content: Content? = null
}

@Root(strict = false)
class Content {

    @get:Attribute(name = "url")
    @set:Attribute(name = "url")
    var url: String? = null

    @get:Attribute(name = "language")
    @set:Attribute(name = "language")
    var language: String? = null

    @get:Attribute(name = "duration")
    @set:Attribute(name = "duration")
    var duration: String? = null

    @get:Element(name = "title")
    @set:Element(name = "title")
    var title: String? = null

    @get:Element(name = "description")
    @set:Element(name = "description")
    var description: String? = null

    @get:Element(name = "thumbnail", required = false)
    @set:Element(name = "thumbnail", required = false)
    var thumbnail: String? = null

}
