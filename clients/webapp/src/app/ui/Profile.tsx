export default function Profile() {
    const user = {
        name: 'Mircea',
        imageUrl: 'https://i.imgur.com/8uq1yHb.jpeg',
        imageSize: 90,
    };

    return (
        <div className="flex items-center w-64 h-24 bg-indigo-500">
            <img
                className="w-16 h-16 rounded-full"
                src={user.imageUrl}
                alt={'Photo of ' + user.name}
            />
            <span>{user.name}</span>
        </div>
        );
}
