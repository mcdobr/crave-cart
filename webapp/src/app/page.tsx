import Image from "next/image";
import Profile from "@/app/profile/profile";
import RestaurantList from "@/app/restaurant/restaurantList";

export default function Home() {
    return (
        <main className="flex min-h-screen flex-col items-center justify-between p-24">
            <Profile/>
            <RestaurantList/>
        </main>
    );
}
