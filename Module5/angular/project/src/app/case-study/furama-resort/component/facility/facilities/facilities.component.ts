import {Component, OnInit} from '@angular/core';
import {Facilities} from "../../../model/facilities";
import {Customer} from "../../../model/customer";
import {FacilitiesService} from "../../../service/facilities/facilities.service";

@Component({
  selector: 'app-facilities',
  templateUrl: './facilities.component.html',
  styleUrls: ['./facilities.component.css']
})
export class FacilitiesComponent implements OnInit {
  facilities: Facilities = {};

  facilitiesList: Facilities[] = [];

  constructor(private facilitiesService: FacilitiesService) {
    // this.facilitiesList.push({
    //     src: "../assets/deluxe2.jpeg",
    //     title: "ocean deluxe",
    //     subtitle: "Room size 43,7m2",
    //     content: "One king bed. Large balcony or patio with Bac My An sea view. 44 square meters (474 square feet).\n" +
    //       "\n" +
    //       "Asian-inspired décor, polished wood floors, walk-in closet, marble bathroom. Separate sitting area with loveseat, coffee table, armchair.\n" +
    //       "\n" +
    //       "Complimentary cable/satellite TV with premium channels. Three direct-dial phones (including bathroom). Minibar, coffee/tea maker. Bathrobes, slippers, bathroom scale. Ceiling fan."
    //   },
    //   {
    //     src: "../assets/suite.jpeg",
    //     title: "ocean suite",
    //     subtitle: "Room size 85,8m2",
    //     content: "French colonial style blends charmingly with traditional Vietnamese interior design.\n" +
    //       "\n" +
    //       "Listen to the sound of the waves and watch the fishermen in their basket boats, while you are relaxing on one of the two outside sofas on the 24 sqm balcony.\n" +
    //       "\n" +
    //       "The suites are adorned with arched ceilings and offer a separate living room and bedroom, two marble bathrooms, two closets, TV for each room. Shiny, polished timber floors compliment the elegant and comfortable furniture.\n" +
    //       "\n" +
    //       "You will enjoy their setting and location on the 4th floor overlooking the unique and untouched “Bac My An beach”."
    //   },
    //   {
    //     src: "../assets/Studio-Suite.jpeg",
    //     title: "ocean studio suite",
    //     subtitle: "Room size 40,1m2",
    //     content: "The new Ocean Studio Suites are decorated in muted cool colors and they feature local Cham artifacts and decorative handicrafts.\n" +
    //       "\n" +
    //       "The L-shape soft supple sofa on the lower level of the “split floor level” Suite, visually separates living and sleeping areas of the Suite and so makes for an elegant, lavishly appointed yet homely atmosphere.\n" +
    //       "\n" +
    //       "Silk cushions and new sumptuous bed linen and pillows make the Suite even more plush and seductive. All these add to the calming and charming character of the Suite."
    //   }, {
    //     src: "../assets/lagoon.jpeg",
    //     title: "lagoon superior",
    //     subtitle: "Room size 40,1m2",
    //     content: "This charming room overlooks our beautiful tropical garden and the landscaped lagoon pool.\n" +
    //       "\n" +
    //       "Enjoy the view over palm trees, plants, and flowers in all kinds of shapes and colors. At night, the pool and garden are romantically illuminated.\n" +
    //       "\n" +
    //       "The room features a timber floor, attractive sitting area, walk-in closet, twin or kingsize bed, and a generous marble bathroom with an oversized shower."
    //   }, {
    //     src: "../assets/garden-deluxe-5.jpeg",
    //     title: "garden deluxe",
    //     subtitle: "Room size 43,7m2",
    //     content: "You will like this deluxe and spacious room!\n" +
    //       "\n" +
    //       "The sitting area with an elegant sofa, coffee table, and comfortable armchair will help you relax. The large bathroom decorated with honey-colored marble offers a separate shower and bathtub."
    //   }, {
    //     src: "../assets/Garden-Superior.jpeg",
    //     title: "garden superior",
    //     subtitle: "Room size 40,1m2",
    //     content: "Enjoy the sunset from the spacious balcony or terrace of this superior room.\n" +
    //       "\n" +
    //       "You will find everything you need to feel comfortable: elegant furniture, twin-sized bed, polished timber floor, walk-in closet, ceiling fan, and a generous marble bathroom with a luxury shower.\n" +
    //       "\n"
    //   }, {
    //     src: "../assets/Presidential-Suite.jpeg",
    //     title: "presidential suite",
    //     subtitle: "Room size 130,0m2",
    //     content: "The new Presidential Suite decorated in royal style with sea view offers its own unique features with oversized living room, large screen TV, bedroom with king bed, marble bathroom housing with bathtub and electric bidet.\n" +
    //       "\n"
    //   }, {
    //     src: "../assets/villas.jpeg",
    //     title: "beach front villas",
    //     subtitle: "Room size 900,0m2",
    //     content: "Diamond villas are the most luxurious of the Furama Villas. Right on the beach, with modern interiors completed with traditional elements, the coastal sunlight is the main feature. A natural flowing water feature creates a continuous serene ambiance which is furthermore accentuated by grand mirrors, adding opulence and luxury. The harmony of space, color, and light sparkles like a diamond!\n" +
    //       "\n" +
    //       "The villa has 4 bedrooms, two on each floor, all own a broad view of the ocean. Large private swimming pool by the grass garden on the beach where you can gather with friends and family members for a cocktail reception or a BBQ."
    //   }, {
    //     src: "../assets/vilas-pool.jpeg",
    //     title: "Pool villas",
    //     subtitle: "Room size 320,0m2",
    //     content: "This is a living with natural sunlight and the sophistication of traditional and contemporary design. The ground floor is completely flanked by floor-to-ceiling windows covered with beautiful mahogany wooden shutters. The kitchen, modern and beautiful, is open to the deck and cobalt tiled pool, with sleek and modern appliances and a marble counter surface, and a rich mahogany dining area.\n" +
    //       "\n" +
    //       "The two main bedrooms are on the second floor while another bedroom on the third floor which can be an ideal place for children. All the rooms are designed with simplistic luxury in mind, open to the sun and the lush garden."
    //   }
    // )

  }

  ngOnInit(): void {
    this.facilitiesService.findAll().subscribe((data) => {
      this.facilitiesList = data;
    })
  }

  showModalDel(id: number) {
    this.facilitiesService.findById(id).subscribe(data => {
      this.facilities = data;
    });
  }

  delFaci(id: number) {
    this.facilitiesService.deleteById(id).subscribe(() => {
    }, error => {
    }, () => {
      this.ngOnInit();
    })
  }
}
