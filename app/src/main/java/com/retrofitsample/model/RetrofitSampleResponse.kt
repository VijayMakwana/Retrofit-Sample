package com.retrofitsample.model
import com.google.gson.annotations.SerializedName


/**
 * Created by HP on 11-05-2018.
 */


data class RetrofitSampleResponse(
		@SerializedName("_id") val id: String,
		@SerializedName("index") val index: Int,
		@SerializedName("guid") val guid: String,
		@SerializedName("isActive") val isActive: Boolean,
		@SerializedName("balance") val balance: String,
		@SerializedName("picture") val picture: String,
		@SerializedName("age") val age: Int,
		@SerializedName("eyeColor") val eyeColor: String,
		@SerializedName("name") val name: Name,
		@SerializedName("company") val company: String,
		@SerializedName("email") val email: String,
		@SerializedName("phone") val phone: String,
		@SerializedName("address") val address: String,
		@SerializedName("about") val about: String,
		@SerializedName("registered") val registered: String,
		@SerializedName("latitude") val latitude: String,
		@SerializedName("longitude") val longitude: String,
		@SerializedName("tags") val tags: List<String>,
		@SerializedName("range") val range: List<Int>,
		@SerializedName("friends") val friends: List<Friend>,
		@SerializedName("greeting") val greeting: String,
		@SerializedName("favoriteFruit") val favoriteFruit: String
)

data class Name(
		@SerializedName("first") val first: String,
		@SerializedName("last") val last: String
)

data class Friend(
		@SerializedName("id") val id: Int,
		@SerializedName("name") val name: String
)

//Here is the json response we got from service call
/*
[
{
	"_id": "5af52b4967f1352b279ec9d4",
	"index": 0,
	"guid": "5b73109d-50f3-4d40-85c1-611561eb6b2f",
	"isActive": true,
	"balance": "$2,957.97",
	"picture": "http://placehold.it/32x32",
	"age": 36,
	"eyeColor": "brown",
	"name": {
	"first": "Knowles",
	"last": "Zamora"
},
	"company": "COLAIRE",
	"email": "knowles.zamora@colaire.ca",
	"phone": "+1 (892) 431-3535",
	"address": "894 Charles Place, Tetherow, Connecticut, 1371",
	"about": "Ea pariatur exercitation esse magna Lorem nisi incididunt consequat labore culpa cupidatat. Reprehenderit fugiat adipisicing sint labore elit proident mollit deserunt. Duis magna commodo id laboris anim ullamco culpa adipisicing. Quis labore elit do commodo eiusmod cupidatat nisi. Mollit aliquip deserunt aliqua labore sit incididunt ipsum nostrud aute. Ex veniam cupidatat excepteur cupidatat proident dolor proident ad excepteur. Id consectetur esse duis duis proident amet do sit ut ex incididunt occaecat.",
	"registered": "Friday, May 9, 2014 4:43 AM",
	"latitude": "-30.279308",
	"longitude": "86.341918",
	"tags": [
	"laboris",
	"cillum",
	"ea",
	"anim",
	"eiusmod"
	],
	"range": [
	0,
	1,
	2,
	3,
	4,
	5,
	6,
	7,
	8,
	9
	],
	"friends": [
	{
		"id": 0,
		"name": "Fisher Chan"
	},
	{
		"id": 1,
		"name": "Mcguire Anthony"
	},
	{
		"id": 2,
		"name": "Kirby King"
	}
	],
	"greeting": "Hello, Knowles! You have 9 unread messages.",
	"favoriteFruit": "apple"
},
{
	"_id": "5af52b49c02d0e5806598a47",
	"index": 1,
	"guid": "a225dc73-a9de-4c3b-8ec5-3a39909c5ee8",
	"isActive": false,
	"balance": "$1,091.99",
	"picture": "http://placehold.it/32x32",
	"age": 39,
	"eyeColor": "green",
	"name": {
	"first": "Hillary",
	"last": "Rojas"
},
	"company": "MEDALERT",
	"email": "hillary.rojas@medalert.net",
	"phone": "+1 (979) 510-2278",
	"address": "124 Lincoln Place, Beaverdale, Illinois, 5157",
	"about": "Mollit cillum ipsum proident incididunt aliquip cupidatat. Exercitation mollit elit ut incididunt ullamco id eiusmod dolore irure. Eu nulla adipisicing Lorem fugiat officia quis exercitation magna id exercitation proident excepteur fugiat. Id aliqua pariatur pariatur dolor anim amet pariatur in tempor dolore sit ex. Id eu velit aliquip eu adipisicing.",
	"registered": "Wednesday, March 18, 2015 6:03 PM",
	"latitude": "61.206038",
	"longitude": "-176.27038",
	"tags": [
	"irure",
	"aliquip",
	"culpa",
	"in",
	"Lorem"
	],
	"range": [
	0,
	1,
	2,
	3,
	4,
	5,
	6,
	7,
	8,
	9
	],
	"friends": [
	{
		"id": 0,
		"name": "Zimmerman Bradford"
	},
	{
		"id": 1,
		"name": "Marsha Mcdaniel"
	},
	{
		"id": 2,
		"name": "Fry Woodward"
	}
	],
	"greeting": "Hello, Hillary! You have 7 unread messages.",
	"favoriteFruit": "strawberry"
},
{
	"_id": "5af52b49a384b804ba54a74e",
	"index": 2,
	"guid": "319b42e1-3279-48f6-ba5b-3ac5cf581c51",
	"isActive": false,
	"balance": "$1,525.68",
	"picture": "http://placehold.it/32x32",
	"age": 31,
	"eyeColor": "blue",
	"name": {
	"first": "Joni",
	"last": "Pratt"
},
	"company": "UPDAT",
	"email": "joni.pratt@updat.biz",
	"phone": "+1 (867) 480-2608",
	"address": "718 Lester Court, Crucible, California, 8913",
	"about": "Consectetur tempor do exercitation sit. Aliquip veniam occaecat ipsum qui reprehenderit sunt id enim ipsum reprehenderit pariatur tempor dolor. Dolore consequat sunt in et consectetur reprehenderit. Commodo eu irure laboris non duis voluptate esse velit qui labore excepteur sit sunt. Incididunt aliquip elit cupidatat pariatur laboris anim enim ad dolor cupidatat Lorem. Ipsum est ipsum minim sunt culpa veniam cupidatat incididunt nisi aliquip ut. Id nostrud Lorem in id ex aliquip sint minim.",
	"registered": "Wednesday, March 12, 2014 8:14 AM",
	"latitude": "67.937863",
	"longitude": "62.821323",
	"tags": [
	"consequat",
	"occaecat",
	"tempor",
	"reprehenderit",
	"pariatur"
	],
	"range": [
	0,
	1,
	2,
	3,
	4,
	5,
	6,
	7,
	8,
	9
	],
	"friends": [
	{
		"id": 0,
		"name": "Oneill Rodriguez"
	},
	{
		"id": 1,
		"name": "Burris Beasley"
	},
	{
		"id": 2,
		"name": "Ofelia Marks"
	}
	],
	"greeting": "Hello, Joni! You have 7 unread messages.",
	"favoriteFruit": "apple"
},
{
	"_id": "5af52b49e8ae6ba7b5e6a38e",
	"index": 3,
	"guid": "d2f1242f-d3c6-4a72-86e0-eb360fb6cda6",
	"isActive": true,
	"balance": "$1,206.58",
	"picture": "http://placehold.it/32x32",
	"age": 27,
	"eyeColor": "blue",
	"name": {
	"first": "Marcie",
	"last": "Aguilar"
},
	"company": "SENMEI",
	"email": "marcie.aguilar@senmei.org",
	"phone": "+1 (812) 413-3808",
	"address": "764 Hoyts Lane, Motley, Maine, 920",
	"about": "Est enim irure voluptate nostrud ex exercitation fugiat commodo nisi esse laboris sunt non. Do cillum quis nisi voluptate labore ex eu commodo ea. Sunt enim non proident commodo cillum ut et commodo consectetur duis culpa. Ullamco adipisicing adipisicing ea Lorem. Magna labore pariatur et tempor. Mollit ut quis duis do exercitation in incididunt quis. Dolor nostrud laboris duis cupidatat laboris officia anim duis culpa eiusmod ad enim id.",
	"registered": "Friday, October 31, 2014 4:43 PM",
	"latitude": "-2.7933",
	"longitude": "-127.414492",
	"tags": [
	"id",
	"sint",
	"dolor",
	"dolor",
	"qui"
	],
	"range": [
	0,
	1,
	2,
	3,
	4,
	5,
	6,
	7,
	8,
	9
	],
	"friends": [
	{
		"id": 0,
		"name": "Rivers Curry"
	},
	{
		"id": 1,
		"name": "Stafford Gallegos"
	},
	{
		"id": 2,
		"name": "Gay Carson"
	}
	],
	"greeting": "Hello, Marcie! You have 10 unread messages.",
	"favoriteFruit": "banana"
},
{
	"_id": "5af52b49ec001f96ffd75ed5",
	"index": 4,
	"guid": "af28d589-9b83-4b35-a0de-1f2171e05294",
	"isActive": false,
	"balance": "$1,068.29",
	"picture": "http://placehold.it/32x32",
	"age": 37,
	"eyeColor": "brown",
	"name": {
	"first": "Brandi",
	"last": "Key"
},
	"company": "FUTURIZE",
	"email": "brandi.key@futurize.io",
	"phone": "+1 (936) 458-3029",
	"address": "119 Sedgwick Place, Olney, Federated States Of Micronesia, 1027",
	"about": "Do amet qui ea Lorem aliqua magna fugiat in. Qui mollit officia voluptate cupidatat quis excepteur cillum ea nostrud laboris fugiat irure nisi. Cupidatat cupidatat labore laborum ea proident mollit in enim proident in laborum occaecat commodo cillum. Ad cillum cillum cillum ullamco non aliquip adipisicing. Magna eiusmod ea do in do ad duis eu est exercitation id. Lorem magna laboris deserunt commodo ea.",
	"registered": "Friday, June 13, 2014 5:41 AM",
	"latitude": "-79.79639",
	"longitude": "7.343096",
	"tags": [
	"aute",
	"reprehenderit",
	"deserunt",
	"proident",
	"ipsum"
	],
	"range": [
	0,
	1,
	2,
	3,
	4,
	5,
	6,
	7,
	8,
	9
	],
	"friends": [
	{
		"id": 0,
		"name": "Pruitt Stout"
	},
	{
		"id": 1,
		"name": "Holloway Noble"
	},
	{
		"id": 2,
		"name": "Christian Morris"
	}
	],
	"greeting": "Hello, Brandi! You have 10 unread messages.",
	"favoriteFruit": "apple"
},
{
	"_id": "5af52b49871bdb8de6a6f4a6",
	"index": 5,
	"guid": "ac05ba46-e8b9-4585-8729-f1dccd43dd62",
	"isActive": true,
	"balance": "$2,201.56",
	"picture": "http://placehold.it/32x32",
	"age": 25,
	"eyeColor": "brown",
	"name": {
	"first": "Bonnie",
	"last": "Martinez"
},
	"company": "STEELTAB",
	"email": "bonnie.martinez@steeltab.name",
	"phone": "+1 (946) 579-2271",
	"address": "296 Willoughby Street, Austinburg, Guam, 7427",
	"about": "Excepteur pariatur sit anim quis sit. Consequat occaecat ea velit qui. Minim esse labore proident qui id. Labore do eiusmod cillum reprehenderit sint labore cupidatat in minim id veniam. Commodo do duis sunt ullamco sit veniam eu reprehenderit in culpa dolore consectetur dolor. Labore esse laboris reprehenderit est elit esse id. Aliquip sit excepteur id aliquip consequat duis duis est quis.",
	"registered": "Friday, April 24, 2015 12:27 PM",
	"latitude": "-84.073147",
	"longitude": "-82.169172",
	"tags": [
	"do",
	"sint",
	"adipisicing",
	"et",
	"tempor"
	],
	"range": [
	0,
	1,
	2,
	3,
	4,
	5,
	6,
	7,
	8,
	9
	],
	"friends": [
	{
		"id": 0,
		"name": "Traci Mccormick"
	},
	{
		"id": 1,
		"name": "Macias Mcintosh"
	},
	{
		"id": 2,
		"name": "Green Roman"
	}
	],
	"greeting": "Hello, Bonnie! You have 8 unread messages.",
	"favoriteFruit": "strawberry"
},
{
	"_id": "5af52b4963ffca1ab11f087c",
	"index": 6,
	"guid": "5758be1e-97ec-4c45-b088-d9952cae7169",
	"isActive": false,
	"balance": "$1,578.09",
	"picture": "http://placehold.it/32x32",
	"age": 33,
	"eyeColor": "blue",
	"name": {
	"first": "England",
	"last": "Dunlap"
},
	"company": "ENERSAVE",
	"email": "england.dunlap@enersave.me",
	"phone": "+1 (891) 432-2833",
	"address": "569 College Place, Kipp, New Jersey, 5570",
	"about": "Lorem qui sint aute in veniam magna laboris. Laborum reprehenderit mollit sunt esse elit ut laboris do. Consequat pariatur amet cillum cupidatat deserunt amet excepteur anim pariatur in do eu exercitation. Pariatur duis consectetur excepteur eu ea. Qui laboris dolor cillum proident qui excepteur commodo excepteur. Labore cillum adipisicing proident culpa elit ipsum do quis sint non laborum.",
	"registered": "Wednesday, September 23, 2015 1:08 AM",
	"latitude": "-82.23057",
	"longitude": "107.587909",
	"tags": [
	"nostrud",
	"consectetur",
	"nostrud",
	"duis",
	"tempor"
	],
	"range": [
	0,
	1,
	2,
	3,
	4,
	5,
	6,
	7,
	8,
	9
	],
	"friends": [
	{
		"id": 0,
		"name": "Rosalind Newton"
	},
	{
		"id": 1,
		"name": "Louise Evans"
	},
	{
		"id": 2,
		"name": "Francis Crosby"
	}
	],
	"greeting": "Hello, England! You have 10 unread messages.",
	"favoriteFruit": "apple"
}
]*/
