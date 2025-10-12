import { randomUUID } from "crypto";
import { User } from "../../types/User";
import ProfileForm from "../ui/ProfileForm";

const Profile = async () => {
  const user = await getMyProfile();
  return (
    <>
      <h1>My Profile</h1>
      <ProfileForm user={user} />
    </>
  );
}

const user: User = {
  id: randomUUID(),
  name: 'John Doe',
  imageUrl: 'https://i.imgur.com/8uq1yHb.jpeg',
  imageSize: 90,
};

export async function getMyProfile(): Promise<User> {
  return await Promise.resolve(user);
}


export default Profile;

