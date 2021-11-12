CREATE DATABASE [TrackingEmotions]
USE [TrackingEmotions]
GO
/****** Object:  Table [dbo].[Description]    Script Date: 12.11.2021 16:57:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Description](
	[DescriptionID] [bigint] IDENTITY(1,1) NOT NULL,
	[Text] [nvarchar](500) NULL,
PRIMARY KEY CLUSTERED 
(
	[DescriptionID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Emotion]    Script Date: 12.11.2021 16:57:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Emotion](
	[EmotionID] [bigint] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](50) NULL,
	[EmotionCategoryID] [bigint] NULL,
	[DescriptionID] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[EmotionID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[EmotionCategory]    Script Date: 12.11.2021 16:57:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[EmotionCategory](
	[EmotionCategoryID] [bigint] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](50) NULL,
	[ValenceID] [bigint] NULL,
	[DescriptionID] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[EmotionCategoryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[EmotionLog]    Script Date: 12.11.2021 16:57:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[EmotionLog](
	[EmotionLogID] [bigint] IDENTITY(1,1) NOT NULL,
	[EmotionID] [bigint] NULL,
	[UserID] [bigint] NULL,
	[SocialEnvironmentID] [bigint] NULL,
	[Date] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[EmotionLogID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[EmotionValence]    Script Date: 12.11.2021 16:57:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[EmotionValence](
	[ValenceID] [bigint] NOT NULL,
	[Name] [nvarchar](25) NULL,
PRIMARY KEY CLUSTERED 
(
	[ValenceID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SocialEnvironment]    Script Date: 12.11.2021 16:57:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SocialEnvironment](
	[SocialEnvironmentID] [bigint] IDENTITY(1,1) NOT NULL,
	[Relation] [nvarchar](50) NULL,
	[IsLocation] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[SocialEnvironmentID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[User]    Script Date: 12.11.2021 16:57:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User](
	[UserID] [bigint] IDENTITY(1,1) NOT NULL,
	[FirstName] [nvarchar](85) NULL,
	[LastName] [nvarchar](85) NULL,
	[BirthDate] [date] NULL,
	[Username] [nvarchar](50) NULL,
	[Password] [nvarchar](85) NULL,
	[Gender] [varchar](1) NULL,
	[Email] [nvarchar](85) NULL,
PRIMARY KEY CLUSTERED 
(
	[UserID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Description] ON 
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (1, N'Happiness is an emotional state characterized by feelings of joy, satisfaction, contentment, and fulfillment.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (2, N'A feeling of reassurance and relaxation following release from anxiety or distress caused by a difficult situation.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (3, N'Advice: Lower your voice and keep it calm. Dont miss the chance of encouraging someone or say something nice about someone.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (4, N'Make a list of all the people you are thankful for.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (5, N'What did you hear/saw/felt/experienced beautiful today.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (6, N'Did you hear a good joke?')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (7, N'What did you accomplish today?')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (8, N'You worked really hard for something and you were compensated.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (9, N'You accomplished something you planed and it went exacly how you wanted to.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (10, N'Whatever is happening in your life, see the brighter side of  things.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (11, N'You are feeling good and you show facial expression of joy.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (12, N'You are feeling happy.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (13, N'In every conflictual situation you keep your calm and try to find a middle ground.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (14, N'You are in a nice, calm place, you relax every part of your body and find inner peace.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (15, N'You have free time and you are able to help someone in need.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (16, N'The feeling of listening to lofi, chill music, drinking tea and just watch your favourite tv series.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (17, N'The feeling after a successfull workout.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (18, N'You are feeling tankful for what you get and what is happening in your life.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (19, N'You are feeling good and everything is going as planned.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (20, N'The feeling of being integrated in comunity.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (21, N'You think that you have the abilities and the experiences to succeed.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (22, N'You dont miss the chance of hepling someone out of love and empathy.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (23, N'You empathize with a situation or a person and you want to help them.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (24, N'You feel attracted to someone, you always have him/her in mind, you want to spend all of your time with that person and be there for him/her no matter what.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (25, N'You are seriously envolved in what you are doing so that you put it to an end.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (26, N'You are feeling in some type of way influence by something/someone.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (27, N'You feel happy and can be yourself towards someone you have a lot in common.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (28, N'You feel grateful and whant to do anything that makes him/her happy.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (29, N'The feeling of being integrated in comunity.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (30, N'You think that you have the abilities and the experiences to succeed.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (31, N'Always see the bright side in everything.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (32, N'Something stimulated your sense of creativity.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (33, N'Experiences that led to a feeling of accomplishment, that you succeeded in realising something.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (34, N'The feeling after a successfull workout.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (35, N'Feeling thankful for what you get or what is happening in your life.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (36, N'Advice: Lower your voice and keep it calm. Dont miss the chance of encouraging someone or say something nice about someone.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (37, N'Write down where you are, what you see, what you feel like in that exact moment, take a deep breath and enjoy the moment.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (38, N'A source generated ideas in order to be productive.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (39, N'You feel like you can be authentic in something you believe in.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (40, N'You found out something that didnt live up to your expectations (rather something negative).')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (41, N'You found out something that didnt live up to your expectations (rather neutral).')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (42, N'What did you hear / see / feel / experience beautifully today?')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (43, N'You found out something that didnt live up to your expectations (rather neutral).')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (44, N'You are facing a situation for which you do not have the necessary skills and knowledge to solve it.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (45, N'You think that a situation is not presented authentically and that something is wrong.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (46, N'Its like when a deadline is approaching and youre under pressure because of the time.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (47, N'You feel angry, bitter, sad about a situation for which you are looking for a solution.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (48, N'A situation is unclear, and the solution is often abstract.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (49, N'Who believes too easily, without researching more closely, who easily trusts someone or something.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (50, N'You care about a person and you are afraid of losing them. You become suspicious.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (51, N'Guilt is the emotion most related to weakening self-confidence. People who often feel guilty are programmed not to trust them.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (52, N'You do not trust the information received and you doubt the intentions of others.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (53, N'You are tense, your muscles hurt (especially your neck and back).')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (54, N'You think youre easy to hurt, open. You just said something that can change the course of your life.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (55, N'You think you cant count on what the person in front of you said. You are in an uncertain situation.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (56, N'You dont know what decision to make. Hesitation is a result of insecurity and skepticism.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (57, N'You feel restless and tense. You do not want to be vulnerable in this situation.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (58, N'You feel worried about something or someone.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (59, N'You have just expressed your opinions and you imagine that you have not received empathy and patience.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (60, N'You are frightened and feel alarmed.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (61, N'You are in a position where you are stuck and dont have the abilities and knowledge to handle the situation.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (62, N'Replace negative thoughts with neutral ones-not everything in life is black or white, life is most of the time grey. People tend to exagerate and go in one extreme to another , thats why the best thing to do is to transform those negative thoughts into neutral ones, closer to reality, to the truth. In time those neutral thoughts can become positive.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (63, N'Replace negative thoughts with neutral ones-not everything in life is black or white, life is most of the time grey. People tend to exagerate and go in one extreme to another , thats why the best thing to do is to transform those negative thoughts into neutral ones, closer to reality, to the truth. In time those neutral thoughts can become positive.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (64, N'You cant find the right energy to do anything at the moment. You need time to collect your thoughts.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (65, N'You experienced something disappointing that damaged your trust and caused you pain and stress.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (66, N'Relax by doing something you like. Dont blame yourself. Time will heal.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (67, N'You are in a difficult situation and it only gets worse and worse and no matter what you do it can not be solved')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (68, N'Seems like you are too tired to try, nothing captures your attention')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (69, N'Relax by doing something you like. Dont blame yourself. Time will heal.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (70, N'You are feeling pressured of the fact that you have to workout daily whithout any cheat day and if you dont  you feel guilty')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (71, N'You find motivation according to your skills.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (72, N'You think that you can be easily hurt. You just said something that might change the course of your life.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (73, N'You think that you can be easily hurt. You just said something that might change the course of your life.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (74, N'Replace negative thoughts with neutral ones-not everything in life is black or white, life is most of the time grey. People tend to exagerate and go in one extreme to another , thats why the best thing to do is to transform those negative thoughts into neutral ones, closer to reality, to the truth. In time those neutral thoughts can become positive.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (75, N'Youve been working hard lately and you need to relax.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (76, N'Replace negative thoughts with neutral ones-not everything in life is black or white, life is most of the time grey. People tend to exagerate and go in one extreme to another , thats why the best thing to do is to transform those negative thoughts into neutral ones, closer to reality, to the truth. In time those neutral thoughts can become positive.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (77, N'You are in a stressful situation and feel like you wont be able to solve the problem causing in time.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (78, N'You experienced something disappointing that damaged your trust and caused you pain and stress.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (79, N'You are impressed in a negative way. You werent expecting a certain situation or someone to say something.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (80, N'You are fightened of what could happen.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (81, N'You have a state of extreme irritation, uncontrolled anger and violence. Take 90 seconds, inhale and exhale. Do not allow cortisol to take over.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (82, N'Youre overly irritated.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (83, N'You feel outraged because of an unworthy or unjust deed.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (84, N'You get angry easily right now. Any stimulus can activate this feeling.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (85, N'Compliment the person you feel this way for, at least in your mind.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (86, N'An external stimulus provokes you to act')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (87, N'You are in a situation where you could have solved something, but another person prevented you from doing so. Time creates this feeling.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (88, N'You believe that justice will only solve the problem if you act on injustice. Pride also appears.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (89, N'Jealousy is a persons emotional response to the threat, real or not, of losing the partner he or she is meeting to a third person.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (90, N'You are worried about certain thoughts and you cannot relax until the situation is resolved.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (91, N'You worked for a long time on a project and it didnt work out according to your initial plans. You do not consider the result is in line with your previous achievements.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (92, N'You treat a situation more rationally than emotionally.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (93, N'You tend to get angry quickly and feel short-lived anger.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (94, N'You heard something that invalidated your beliefs and values, maybe even your work.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (95, N'Youve been working hard lately and you need to relax, which is why you tend to beconme irascible and lose your patience.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (96, N'Replace negative thoughts with neutral ones - not everything in life is white or black, life is often gray. But the brain does not know this, for him the situation will be in one of the extremes, so it is best to turn negative thoughts into neutral thoughts, as close as possible to the truth. Over time, you can turn them into positive thoughts.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (97, N'It is okay for fear to occur when vulnerability occurs. We just need to develop greater resilience to shame.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (98, N'It is okay for fear to occur when vulnerability occurs. We just need to develop greater resilience to shame.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (99, N'Jealousy is a persons emotional response to the threat, real or not, of losing the partner he or she is meeting to a third person.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (100, N'Guilt is the emotion most related to weakening self-confidence. People who often feel guilty are programmed not to trust them.')
GO
INSERT [dbo].[Description] ([DescriptionID], [Text]) VALUES (101, N'You are feeling pressured of the fact that you have to workout daily whithout any cheat day and if you dont  you feel guilty')
GO
SET IDENTITY_INSERT [dbo].[Description] OFF
GO
SET IDENTITY_INSERT [dbo].[Emotion] ON 
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (1, N'Joy', 1, 1)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (2, N'Released', 1, 2)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (3, N'Grateful', 1, 3)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (4, N'Blessed', 1, 4)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (5, N'Enchanted', 1, 5)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (6, N'Amused', 1, 6)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (7, N'Proud', 1, 7)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (8, N'Rewarded', 1, 8)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (9, N'Satisfied', 1, 9)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (10, N'Optimistic', 1, 10)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (11, N'Smiling', 1, 11)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (12, N'Happy', 1, 12)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (13, N'Peaceful', 1, 13)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (14, N'Relaxed', 1, 14)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (15, N'Available', 1, 15)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (16, N'Calm', 1, 16)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (17, N'Refreshed', 1, 17)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (18, N'Thankful', 1, 18)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (19, N'In a good mood', 1, 19)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (20, N'Accepted', 2, 20)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (21, N'Trusted', 2, 21)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (22, N'Kind', 2, 22)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (23, N'Compassionate', 2, 23)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (24, N'In love', 2, 24)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (25, N'Devoted', 2, 25)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (26, N'Moved', 2, 26)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (27, N'Friendly', 2, 27)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (28, N'Loved', 2, 28)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (29, N'Accepted', 3, 29)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (30, N'Trusted', 3, 30)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (31, N'Optimistic', 3, 31)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (32, N'Inspired', 3, 32)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (33, N'Fulfilled', 3, 33)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (34, N'Refreshed', 3, 34)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (35, N'Grateful', 3, 35)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (36, N'Satisfied', 3, 36)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (37, N'Attending', 3, 37)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (38, N'Stimulated', 3, 38)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (39, N'Confident', 3, 39)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (40, N'Shocked', 4, 40)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (41, N'Surprised', 4, 41)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (42, N'Enchanted', 4, 42)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (43, N'Astonished', 4, 43)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (44, N'Powerless', 5, 44)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (45, N'Suspicious', 5, 45)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (46, N'Alarmed', 5, 46)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (47, N'Upset', 5, 47)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (48, N'Puzzled', 5, 48)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (49, N'Trusting', 5, 49)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (50, N'Gelous', 5, 50)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (51, N'Guilty', 5, 51)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (52, N'Skeptical', 5, 52)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (53, N'Tense', 5, 53)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (54, N'Vulnerable', 5, 54)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (55, N'Unsure', 5, 55)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (56, N'Hesitant', 5, 56)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (57, N'Anxious', 5, 57)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (58, N'Concerned', 5, 58)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (59, N'Musunderstood', 5, 59)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (60, N'Panicked', 5, 60)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (61, N'Powerless', 6, 61)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (62, N'Strayed', 6, 62)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (63, N'Sad', 6, 63)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (64, N'Droopy', 6, 64)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (65, N'Hurt', 6, 65)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (66, N'Alone', 6, 66)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (67, N'Pessimistic', 6, 67)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (68, N'Apathetic', 6, 68)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (69, N'Retracted', 6, 69)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (70, N'Lazy', 6, 70)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (71, N'Careless', 6, 71)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (72, N'Sensitive', 6, 72)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (73, N'Vulnerable', 6, 73)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (74, N'Lousy', 6, 74)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (75, N'Tired', 6, 75)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (76, N'Depressed', 6, 76)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (77, N'Desperate', 6, 77)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (78, N'Hurt', 7, 78)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (79, N'Shocked', 7, 79)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (80, N'Terrified', 7, 80)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (81, N'Angry', 8, 81)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (82, N'Exasperated', 8, 82)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (83, N'Outraged', 8, 83)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (84, N'Cranky', 8, 84)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (85, N'Hate it', 8, 85)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (86, N'Dared', 8, 86)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (87, N'Frustrated', 8, 87)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (88, N'Revengeful', 8, 88)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (89, N'Gelous', 8, 89)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (90, N'Nervous', 8, 90)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (91, N'Unsatisfied', 8, 91)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (92, N'Harsh', 8, 92)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (93, N'Grumpy', 8, 93)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (94, N'Offensed', 8, 94)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (95, N'Tired', 8, 95)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (96, N'Upset', 9, 96)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (97, N'Pathetic', 9, 97)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (98, N'Embarassed', 9, 98)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (99, N'Gelous', 9, 99)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (100, N'Guilty', 9, 100)
GO
INSERT [dbo].[Emotion] ([EmotionID], [Name], [EmotionCategoryID], [DescriptionID]) VALUES (101, N'Lazy', 9, 101)
GO
SET IDENTITY_INSERT [dbo].[Emotion] OFF
GO
SET IDENTITY_INSERT [dbo].[EmotionCategory] ON 
GO
INSERT [dbo].[EmotionCategory] ([EmotionCategoryID], [Name], [ValenceID], [DescriptionID]) VALUES (1, N'Happiness', 1, NULL)
GO
INSERT [dbo].[EmotionCategory] ([EmotionCategoryID], [Name], [ValenceID], [DescriptionID]) VALUES (2, N'Affection', 1, NULL)
GO
INSERT [dbo].[EmotionCategory] ([EmotionCategoryID], [Name], [ValenceID], [DescriptionID]) VALUES (3, N'I love myself', 1, NULL)
GO
INSERT [dbo].[EmotionCategory] ([EmotionCategoryID], [Name], [ValenceID], [DescriptionID]) VALUES (4, N'Surprise', 0, NULL)
GO
INSERT [dbo].[EmotionCategory] ([EmotionCategoryID], [Name], [ValenceID], [DescriptionID]) VALUES (5, N'Fear', -1, NULL)
GO
INSERT [dbo].[EmotionCategory] ([EmotionCategoryID], [Name], [ValenceID], [DescriptionID]) VALUES (6, N'Sadness', -1, NULL)
GO
INSERT [dbo].[EmotionCategory] ([EmotionCategoryID], [Name], [ValenceID], [DescriptionID]) VALUES (7, N'Disgust', -1, NULL)
GO
INSERT [dbo].[EmotionCategory] ([EmotionCategoryID], [Name], [ValenceID], [DescriptionID]) VALUES (8, N'Anger', -1, NULL)
GO
INSERT [dbo].[EmotionCategory] ([EmotionCategoryID], [Name], [ValenceID], [DescriptionID]) VALUES (9, N'Shame', -1, NULL)
GO
SET IDENTITY_INSERT [dbo].[EmotionCategory] OFF
GO
INSERT [dbo].[EmotionValence] ([ValenceID], [Name]) VALUES (-1, N'Negative')
GO
INSERT [dbo].[EmotionValence] ([ValenceID], [Name]) VALUES (0, N'Neutral')
GO
INSERT [dbo].[EmotionValence] ([ValenceID], [Name]) VALUES (1, N'Positive')
GO
ALTER TABLE [dbo].[Emotion]  WITH CHECK ADD  CONSTRAINT [FK_Emotion.DescriptionID] FOREIGN KEY([DescriptionID])
REFERENCES [dbo].[Description] ([DescriptionID])
GO
ALTER TABLE [dbo].[Emotion] CHECK CONSTRAINT [FK_Emotion.DescriptionID]
GO
ALTER TABLE [dbo].[Emotion]  WITH CHECK ADD  CONSTRAINT [FK_Emotion.EmotionCategoryID] FOREIGN KEY([EmotionCategoryID])
REFERENCES [dbo].[EmotionCategory] ([EmotionCategoryID])
GO
ALTER TABLE [dbo].[Emotion] CHECK CONSTRAINT [FK_Emotion.EmotionCategoryID]
GO
ALTER TABLE [dbo].[EmotionCategory]  WITH CHECK ADD  CONSTRAINT [FK_EmotionCategory.DescriptionID] FOREIGN KEY([DescriptionID])
REFERENCES [dbo].[Description] ([DescriptionID])
GO
ALTER TABLE [dbo].[EmotionCategory] CHECK CONSTRAINT [FK_EmotionCategory.DescriptionID]
GO
ALTER TABLE [dbo].[EmotionCategory]  WITH CHECK ADD  CONSTRAINT [FK_EmotionCategory.ValenceID] FOREIGN KEY([ValenceID])
REFERENCES [dbo].[EmotionValence] ([ValenceID])
GO
ALTER TABLE [dbo].[EmotionCategory] CHECK CONSTRAINT [FK_EmotionCategory.ValenceID]
GO
ALTER TABLE [dbo].[EmotionLog]  WITH CHECK ADD  CONSTRAINT [FK_EmotionLog.EmotionID] FOREIGN KEY([EmotionID])
REFERENCES [dbo].[Emotion] ([EmotionID])
GO
ALTER TABLE [dbo].[EmotionLog] CHECK CONSTRAINT [FK_EmotionLog.EmotionID]
GO
ALTER TABLE [dbo].[EmotionLog]  WITH CHECK ADD  CONSTRAINT [FK_EmotionLog.SocialEnvironmentID] FOREIGN KEY([SocialEnvironmentID])
REFERENCES [dbo].[SocialEnvironment] ([SocialEnvironmentID])
GO
ALTER TABLE [dbo].[EmotionLog] CHECK CONSTRAINT [FK_EmotionLog.SocialEnvironmentID]
GO
ALTER TABLE [dbo].[EmotionLog]  WITH CHECK ADD  CONSTRAINT [FK_EmotionLog.UserID] FOREIGN KEY([UserID])
REFERENCES [dbo].[User] ([UserID])
GO
ALTER TABLE [dbo].[EmotionLog] CHECK CONSTRAINT [FK_EmotionLog.UserID]
GO
