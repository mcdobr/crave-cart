export default function Profile() {
    const user = {
        name: 'Mircea',
        imageUrl: 'https://i.imgur.com/8uq1yHb.jpeg',
        imageSize: 90,
    };

    return (
        <>
            <h1>{user.name}</h1>
            <img
                className="avatar"
                src={user.imageUrl}
                alt={'Photo of ' + user.name}
                style={{
                    width: user.imageSize,
                    height: user.imageSize,
                }}
            />
        </>
        );
}
