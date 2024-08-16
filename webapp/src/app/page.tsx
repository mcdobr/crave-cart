import Image from "next/image";
import Profile from "@/app/profile/profile";

export default function Home() {
    const restaurants = [
        {
            id: 1,
            name: 'Restaurant 1',
        },
        {
            id: 2,
            name: 'Restaurant 2'
        },
    ];

    const restaurantListItems = restaurants.map(restaurant => <li key={restaurant.name}>{restaurant.name}</li>);

    return (
        <main className="flex min-h-screen flex-col items-center justify-between p-24">
            <Profile/>
            <ul>{restaurantListItems}</ul>
        </main>
    );
}
