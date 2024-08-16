import Image from "next/image";

export default function Home() {

  const restaurants = [
      {
        name: 'Restaurant 1',
      },
        {
        name: 'Restaurant 2'
       },
  ];

  const restaurantListItems = restaurants.map(restaurant => <li key={restaurant.name}>{restaurant.name}</li>);

  return (
    <main className="flex min-h-screen flex-col items-center justify-between p-24">
        <ul>{restaurantListItems}</ul>
    </main>
  );
}
