import logger from "@/lib/logger";
import Link from "next/link";
import { getMyProfile } from "../profile/page";

export default async function Profile() {
    const user = await getMyProfile();
    if (logger.isLevelEnabled('debug')) {
        logger.debug({user}, 'Loaded user profile');
    }

    return (
        <div className="flex items-center w-64 h-24 bg-indigo-500">
            <img
                className="w-16 h-16 rounded-full"
                src={user.imageUrl}
                alt={'Photo of ' + user.name}
            />
            <Link href={`/profile`}>
                <span>{user.name}</span>
            </Link>
        </div>
        );
}
